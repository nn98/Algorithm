import sys
import heapq

readLine = sys.stdin.readline
num_city = int(readLine())
num_bus = int(readLine())
dist = int(1e9) * (num_city+1)
graph = [[] for _ in range(num_city + 1)]

for _ in range(num_bus):
    departure, arrival, cost = map(int, readLine().split())
    graph[departure].append((arrival, cost))

def dijkstra(start):
    dist[start] = 0
    end = start         # X
    q = graph[start]    # q=[]
                        # heapq.heappush(q,(0,start))
    while q:
        # end, cost = heapq.heappop(q)
        # if dist[end] < dis: continue - 더 빠른 경로가 있을 경우 스킵
        for next in graph[end]:
            arrival, cost = next    # 위로
                                    # nextArrival, nextCost = next
                                    # newCost = cost + dist[end] + nextCost
            if dist[arrival] > cost + dist[end]:    # if newCost < dist[nextArrival]
                dist[arrival] = cost + dist[end]    # O
                heapq.heappush(q, q[arrival])       # nextArrival, newCost


final_departure, final_arrival = map(int, readLine().split())
dijkstra(final_departure)
print(dist[final_arrival])