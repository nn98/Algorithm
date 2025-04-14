import sys
import heapq

readLine = sys.stdin.readline
num_city, num_bus = map(int, readLine().split())
INF = int(1e9)
dist = [INF] * (num_city+1)
route = []*(num_city+1)
graph = [[] for _ in range(num_city + 1)]

for _ in range(num_bus):
    departure, arrival, cost = map(int, readLine().split())
    graph[departure].append((arrival, cost))
    graph[arrival].append((departure, cost))

def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    dist[start] = 0

    while q:
        print(dist)
        cost, now = heapq.heappop(q)
        if dist[now] < cost: continue
        for nextArrival, nextCost in graph[now]:
            newCost = nextCost + dist[now]
            if newCost < dist[nextArrival]:
                dist[nextArrival] = newCost
                heapq.heappush(q, (newCost, nextArrival))


final_departure, final_arrival = map(int, readLine().split())
dijkstra(final_departure)
print(dist[final_arrival])