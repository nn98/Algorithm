import sys
import heapq

input = sys.stdin.readline
num = int(input())
INF = int(1e9)
dist = [INF] * (num+1)
g = [[] for _ in range(num+1)]
for _ in range(num):
    start, end, cost = map(int, input().split())
    g[start].append((end, cost))
for e in g:
    print(e)

def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    dist[start] = 0
    while q:
        dis, end = heapq.heappop(q)
        if dist[end] < dis:
            continue
        for next in g[end]:
            cost = dist[end] + next[1]
            if cost < dist[next[0]]:
                dist[next[0]] = cost
                heapq.heappush(q, (cost, next[0]))

dijkstra(1)
print("Start : 0")
for i in range(1, len(dist)):
    if dist[i] == INF:
        print("cannot")
    else:
        print(dist[i])