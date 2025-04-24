import sys
import heapq
readline = sys.stdin.readline

def dijkstra(start):
    dist[start][start] = 0
    q = []
    heapq.heappush(q,(0,start))
    while q:
        value, node = heapq.heappop(q)
        if dist[start][node] < value:
            continue
        for nextNode, nextValue in matrix[node]:
            valueSum = dist[start][node] + nextValue
            if dist[start][nextNode] > valueSum:
                dist[start][nextNode] = valueSum
                heapq.heappush(q,(valueSum,nextNode))

n, e = map(int,readline().split())
matrix = [[] for _ in range(1000001)]
INF = int(1e9)
dist = [[] for _ in range(1000001)]
for i in range(e):
    start, end, value = map(int, readline().split())
    matrix[start].append((end,value))
    matrix[end].append((start,value))
u, v = map(int,readline().split())
if not (1 <= u <= n and 1 <= v <= n):
    print(-1)
    sys.exit()
for i in [1,u,v]:
    dist[i] = [INF] * (1000001)
dijkstra(1)
dijkstra(u)
dijkstra(v)
result = min(dist[1][u]+dist[u][v]+dist[v][n], dist[1][v]+dist[v][u]+dist[u][n])
# result = min(dist[start][u]+dist[u][v]+dist[v][n], dist[start][v]+dist[v][u]+dist[u][n])
# 경고를 띄웠는데도 안본 병신
print(result if result < INF else -1)