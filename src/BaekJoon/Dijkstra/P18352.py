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
        for nextNode, nextCost in g[node]:
            newCost = nextCost+cost
            if dist[nextNode] > newCost:
                dist[nextNode] = newCost
                heapq.heappush(q,(newCost, nextNode))

N, M, K, X = map(int, readLine().split())
INF = int(1e9)
dist = [INF] * (N+1)
g = [[] for i in range(N+1)]
for i in range(M):
    a, b = map(int, readLine().split())
    g[a].append((b,1))

dijkstra(X)
isResult = False
for i in range(N+1):
    if dist[i] == K:
        print(i)
        isResult=True
if not isResult:
    print(-1)