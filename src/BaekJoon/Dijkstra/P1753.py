import sys
import heapq
readLine = sys.stdin.readline

def dijkstra(start):
    q=[]
    dist[start] = 0
    heapq.heappush(q,(0,start))
    while(q):
        cost, node = heapq.heappop(q)
        if dist[node] < cost: continue;
        # dist[node] = cost
        for nextCost, nextNode in g[node]:
            newCost = nextCost+cost
            if dist[nextNode] > newCost:
                dist[nextNode] = newCost
                heapq.heappush(q,(newCost, nextNode))

N, M = map(int, readLine().split())
S = int(readLine())
INF = int(1e9)
dist = [INF] * (N+1)
g = [[] for i in range(N+1)]
for i in range(M):
    a, b, c = map(int, readLine().split())
    g[a].append((b,c))

dijkstra(S)
isResult = False
for i in range(1, N+1):
    print(dist[i] if dist[i] != INF else 'INF')
