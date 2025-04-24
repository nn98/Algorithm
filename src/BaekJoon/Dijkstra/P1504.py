import sys
import heapq
readline = sys.stdin.readline

def dijkstra(start):
    dist[start] = 0
    q = []
    heapq.heappush(q,(0,start))
    while(q):
        value, node = heapq.heappop(q)
        if dist[node] < value:
            continue
        for nextNode, nextValue in matrix[node]:
            valueSum = dist[node] + nextValue
            if dist[nextNode] > valueSum:
                dist[nextNode] = valueSum
                heapq.heappush(q,(nextValue,nextNode))

n, e = map(int,readline().split())
matrix = [[] for _ in range(e+1)]
INF = int(1e9)
dist = [INF] * (n+1)
for i in range(e):
    start, end, value = map(int, readline().split())
    matrix[start].append((end,value))
    matrix[end].append((start,value))
u, v = map(int,readline().split())
dijkstra(1)
print(dist)
