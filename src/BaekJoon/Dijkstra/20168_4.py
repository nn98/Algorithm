import sys
import heapq

def find_min_max_cost():
    input = sys.stdin.readline
    N, M, A, B, C = map(int, input().split())
    N += 1  # 노드 번호 1부터 시작 가정

    graph = [[] for _ in range(N)]
    for _ in range(M):
        a, b, c = map(int, input().split())
        graph[a].append((b, c))
        graph[b].append((a, c))

    # 각 노드별 (최대간선비용, 총비용) 추적
    max_cost = [float('inf')] * N
    total_cost = [float('inf')] * N

    heap = []
    heapq.heappush(heap, (0, 0, A))  # (현재 경로 최대비용, 총비용, 노드)
    max_cost[A] = 0
    total_cost[A] = 0

    answer = -1

    while heap:
        current_max, acc, node = heapq.heappop(heap)

        # 목표 노드 도달 시 즉시 반환 (우선순위 큐 특성상 첫 도착이 최소)
        if node == B:
            answer = current_max
            break

        # 현재 정보보다 나쁜 경우 스킵
        if current_max > max_cost[node] or acc > total_cost[node]:
            continue

        for neighbor, edge_cost in graph[node]:
            new_max = max(current_max, edge_cost)
            new_acc = acc + edge_cost

            # 예산 초과 시 제외
            if new_acc > C:
                continue

            # 더 좋은 경로 발견 시 업데이트
            if new_max < max_cost[neighbor] or (new_max == max_cost[neighbor] and new_acc < total_cost[neighbor]):
                max_cost[neighbor] = new_max
                total_cost[neighbor] = new_acc
                heapq.heappush(heap, (new_max, new_acc, neighbor))

    print(answer if answer != -1 else -1)

find_min_max_cost()
