import sys
import heapq
from collections import defaultdict

readLine = sys.stdin.readline
num_city, num_bus = map(int, readLine().split())
visible = list(map(int, input().split()))
visible[num_city-1] = 0
INF = float('inf')
dist = [INF] * (num_city+1)
graph = defaultdict(list)

for _ in range(num_bus):
    departure, arrival, cost = map(int, readLine().split())
    graph[departure].append((arrival, cost))
    graph[arrival].append((departure, cost))

def dijkstra(start):
    q = [(0,0)]
    dist[start] = 0

    while q:
        cost, now = heapq.heappop(q)
        if dist[now] < cost: continue
        for next in graph[now]:
            nextArrival, nextCost = next
            if visible[nextArrival] == 1 and nextArrival != num_city - 1 : continue
            # newCost = nextCost + dist[now]
            newCost = nextCost + cost
            if dist[nextArrival] > newCost:
                dist[nextArrival] = newCost
                heapq.heappush(q, (newCost, nextArrival))

dijkstra(0)
# print(graph)
# print(dist)
print(dist[num_city-1] if dist[num_city-1] != INF else -1)