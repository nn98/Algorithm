import sys
from collections import deque

readline = sys.stdin.readline

n , m = map(int, readline().split())
rel = [set() for _ in range(n)]
dis = [[int(1e9) for _ in range(n)] for _ in range(n)]

for i in range(m):
    a, b = map(int, readline().split())
    a-=1
    b-=1
    rel[a].add(b)
    rel[b].add(a)

q = deque()
for i in range(n):
    q.append((i,1))
while q:
    now, d = q.popleft()
    for i in rel[now]:
        if dis[now][i] > d:
            dis[now][i] = dis[i][now] = d
            q.append((i, d+1))

MIN = int(1e9)
ans = -1
for i in range(n):
    if min(dis[i]) < MIN:
        ans = i
        MIN = min(dis[i])

print('\n'.join(map(str,dis)))
print(ans+1)
