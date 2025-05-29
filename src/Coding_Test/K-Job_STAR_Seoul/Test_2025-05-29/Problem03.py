import sys
readline = sys.stdin.readline

def dfs(start, depth):
    print(start,depth)
    hist[start] = 1
    if depth > S: return 0
    if reach[start] > 0: return 1
    for i in range(N+1):
        if road[start][i] > 0:
            if hist[i]<1:
                rs = dfs(i,depth+1)
                reach[start] = max(reach[start],rs)

    return reach[start]




N, M, S = map(int, readline().split())
K = int(readline())

reach = [0] * (N+1)
cul = list(map(int,readline().split()))
road = [[0] * (N+1) for _ in range(N+1)]
for _ in range(M):
    a, b = map(int,readline().split())
    road[a][b] = road[b][a] = 1

print()
for i in cul:
    reach[i] = 1
for i in range(1,N+1):
    hist = [0] * (N+1)
    if reach[i] < 1: dfs(i,0)
    print(reach)

print(sum(reach))
