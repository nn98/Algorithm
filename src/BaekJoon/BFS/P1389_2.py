import sys
from collections import deque
readline = sys.stdin.readline

def bfs(start):
    q = deque()
    q.append(start)
    while q:
        cur = q.popleft()
        for next in rel[cur]:
            if start != next and visited[next] < 1:
                visited[next] = visited[cur] + 1
                q.append(next)

n , m = map(int, readline().split())
rel = [set() for _ in range(n)]
ans = int(1e9)

for i in range(m):
    a, b = map(int, readline().split())
    a-=1
    b-=1
    rel[a].add(b)
    rel[b].add(a)

for i in range(n):
    visited = [0 for i in range(n)]
    bfs(i)
    print(i, visited)
    k = sum(visited)
    if k < ans:
        ans = k
        min_index = i

print(min_index+1)