import sys
from collections import deque

readline = sys.stdin.readline

N, M, S = map(int, readline().split())
K = int(readline())
cul = list(map(int, readline().split()))

# 인접 리스트 생성
adj = [[] for _ in range(N+1)]
for _ in range(M):
    a, b = map(int, readline().split())
    adj[a].append(b)
    adj[b].append(a)

distance = [-1] * (N + 1)  # 초기 거리 -1 (도달 불가)
q = deque()

# cul 노드들을 시작점으로 설정
for node in cul:
    distance[node] = 0
    q.append(node)

# BFS로 최단 거리 계산
while q:
    current = q.popleft()
    for neighbor in adj[current]:
        if distance[neighbor] == -1:
            distance[neighbor] = distance[current] + 1
            q.append(neighbor)

# S 이하 거리 노드 카운트
count = 0
for i in range(1, N+1):
    if 0 <= distance[i] <= S:
        count += 1

print(count)

# 6 6 2
# 2
# 4 5
# 1 2
# 1 3
# 1 4
# 2 3
# 2 6
# 3 5