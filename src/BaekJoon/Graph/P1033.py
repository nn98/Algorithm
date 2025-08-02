import sys

N = int(sys.stdin.readline())

graph = [[] for _ in range(N)]
lcm = 1

def gcd(a, b):
    if (b == 0):
        return a
    else:
        return gcd(b, a % b)

for _ in range(N - 1):
    a, b, p, q = map(int, sys.stdin.readline().split())
    graph[a].append([b, p, q])
    graph[b].append([a, q, p])
    lcm *= (p * q // gcd(p, q))

visited = [True] * N

def DFS(v):
    visited[v] = False
    for i in graph[v]:
        next = i[0]
        if (visited[next]):
            li[next] = li[v] * i[2] // i[1]
            DFS(next)

li = [0] * N
li[0] = lcm
DFS(0)

mgcd = li[0]
for i in range(1, N):
    mgcd = gcd(mgcd, li[i])

for i in range(N):
    print(int(li[i] // mgcd), end=' ')
