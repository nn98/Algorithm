import sys
import heapq

readLine = sys.stdin.readline
num_city = int(readLine())
num_bus = int(readLine())
INF = int(1e9)
dist = [INF] * (num_city+1)
graph = [[] for _ in range(num_city + 1)]

for _ in range(num_bus):
    departure, arrival, cost = map(int, readLine().split())
    graph[departure].append((arrival, cost))

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


final_departure, final_arrival = map(int, readLine().split())
dijkstra(final_departure)
print(dist[final_arrival])