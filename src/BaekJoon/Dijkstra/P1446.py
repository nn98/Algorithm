import sys
import heapq

input = sys.stdin.readline
num, road = map(int, input().split())
INF = int(1e9)
dist = [INF] * 10001

g = [[] for _ in range(10001)]

for i in range(road):
    g[i].append((i+1, 1))
    g[i].append((road, road-i))
for _ in range(num):
    start, end, cost = map(int, input().split())
    # if g[start] == []: g[start].append((road, road-start))
    g[start].append((end, cost))
# for i in range(road+1):
#     print(g[i])

def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    dist[start] = 0
    while q:
        dis, end = heapq.heappop(q)
        # print(dis, end)
        if dist[end] < dis:
            continue
        for next in g[end]:
            cost = dist[end] + next[1]
            # print("end:", end, "next:", next, "cost:", cost, "dist[next[0]]:", dist[next[0]])
            if cost < dist[next[0]]:
                dist[next[0]] = cost
                # print("dist[next[0]]:", dist[next[0]])
                heapq.heappush(q, (cost, next[0]))

dijkstra(0)
print(dist[road])
# print("Start : 0")
# for i in range(road): print(dist[i], end=' ')
# for i in range(1, road):
#     if dist[i] == INF:
#         print("cannot", end=' ')
#     else:
#         print(dist[i], end=' ')