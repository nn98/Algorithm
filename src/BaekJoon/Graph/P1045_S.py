import sys
from heapq import heappush, heappop

def main():
    # 입력: 첫 줄에 N, M
    N, M = map(int, sys.stdin.readline().split())
    roads = []
    matrix = [sys.stdin.readline().strip() for _ in range(N)]

    # 인접행렬에서 (i, j) 쌍 추출 (i < j, 'Y'만)
    for i in range(N):
        for j in range(i+1, N):
            if matrix[i][j] == 'Y':
                heappush(roads, (i, j))  # 사전순 도로 저장

    # 예외: 도로 수 부족 또는 M이 N-1 미만
    if len(roads) < M or M < N-1:
        print(-1)
        return

    # Union-Find 초기화
    parent = list(range(N))
    def find(u):
        while parent[u] != u:
            parent[u] = parent[parent[u]]
            u = parent[u]
        return u

    # 1. MST 구성 (N-1개 도로)
    selected = []
    edge_count = 0
    temp_roads = []
    while roads and edge_count < N-1:
        a, b = heappop(roads)
        ra = find(a)
        rb = find(b)
        temp_roads.append((a, b))
        if ra != rb:
            parent[ra] = rb
            selected.append((a, b))
            edge_count += 1

    if edge_count != N-1:
        print(-1)
        return

    # 2. 남은 도로 우선순위대로 추가
    extra_needed = M - (N-1)
    extra_roads = []
    while roads and len(extra_roads) < extra_needed:
        a, b = heappop(roads)
        extra_roads.append((a, b))
    if len(extra_roads) < extra_needed:
        print(-1)
        return
    selected += extra_roads

    # 연결성 재검증 (Union-Find 재설정)
    parent = list(range(N))
    for a, b in selected:
        ra = find(a)
        rb = find(b)
        if ra != rb:
            parent[ra] = rb
    root = find(0)
    if any(find(i) != root for i in range(N)):
        print(-1)
        return

    print(selected)
    # 각 도시의 도로 개수 출력
    degree = [0] * N
    for a, b in selected:
        degree[a] += 1
        degree[b] += 1
    print(' '.join(map(str, degree)))

if __name__ == "__main__":
    main()
