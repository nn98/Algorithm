import sys
import heapq

readLine = sys.stdin.readline
num_city, num_bus = map(int, readLine().split())
INF = int(1e9)
dist = [INF] * (num_city+1)
graph = [[] for _ in range(num_city + 1)]

for _ in range(num_bus):
    departure, arrival, cost = map(int, readLine().split())
    graph[departure].append((arrival, cost))
    graph[arrival].append((departure, cost))

def dijkstra(start):
    q = []
    heapq.heappush(q, (start, 0))
    dist[start] = 0

    while q:
        now, cost = heapq.heappop(q)
        if dist[now] < cost: continue
        for next in graph[now]:
            nextArrival, nextCost = next
            newCost = nextCost + dist[now]
            if dist[nextArrival] > newCost:
                dist[nextArrival] = newCost
                heapq.heappush(q, (nextArrival, newCost))

dijkstra(1)
# print(graph)
print(dist[num_city])