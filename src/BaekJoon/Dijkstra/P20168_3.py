import sys
import heapq

readLine = sys.stdin.readline
N, M, A, B, C = map(int, readLine().split())
N += 1  # 노드 번호 1부터 시작 가정

matrix = [[] for _ in range(N)]
for _ in range(M):
    a, b, c = map(int, readLine().split())
    matrix[a].append((c, b))
    matrix[b].append((c, a))

# 최소 누적 비용과 경로별 최대 비용 추적
total = [float('inf')] * N
max_cost = [float('inf')] * N  # 각 노드까지의 경로에서 최대 비용

def dijkstra(start):
    heap = []
    # (누적비용, 현재노드, 경로 최대비용)
    heapq.heappush(heap, (0, start, 0))
    total[start] = 0
    max_cost[start] = 0

    while heap:
        acc, node, current_max = heapq.heappop(heap)

        if acc > total[node]:  # 이미 더 좋은 경로 존재
            continue

        if node == B:  # 목적지 도달
            continue  # 다른 경로도 확인해야 하므로 종료하지 않음

        for edge_cost, next_node in matrix[node]:
            new_acc = acc + edge_cost
            new_max = max(current_max, edge_cost)

            if new_acc > C:  # 예산 초과
                continue

            # 더 작은 최대 비용 또는 더 적은 누적 비용
            if (new_acc < total[next_node]) or (new_acc == total[next_node] and new_max < max_cost[next_node]):
                total[next_node] = new_acc
                max_cost[next_node] = new_max
                heapq.heappush(heap, (new_acc, next_node, new_max))

dijkstra(A)

print(max_cost[B] if max_cost[B] != float('inf') else -1)
