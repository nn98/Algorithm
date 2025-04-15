import sys
import heapq
# Timeout -> DP
def dijkstra():
    q = []
    heapq.heappush(q, (0,0,0))
    dist[0][0]=0
    while(q):
        cost, x, y = heapq.heappop(q)
        if dist[x][y] < cost: continue
        if y < N-1:
            newCost = cost + ((matrix[x][y+1]-matrix[x][y]+1) if matrix[x][y+1] >= matrix[x][y] else 0)
            if dist[x][y+1] > newCost:
                dist[x][y+1] = newCost
                heapq.heappush(q,(newCost,x,y+1))
        if x < N-1:
            newCost = cost + ((matrix[x+1][y]-matrix[x][y]+1) if matrix[x+1][y] >= matrix[x][y] else 0)
            if dist[x+1][y] > newCost:
                dist[x+1][y] = newCost
                heapq.heappush(q,(newCost,x+1,y))

readLine = sys.stdin.readline
INF = int(1e9)
N = int(readLine())
matrix = [[] for _ in range(N)]
dist = [[INF] * N for _ in range(N)]
# for M in matrix:
#     print(M)
for i in range(N):
    matrix[i] = list(map(int,readLine().split()))
# for M in matrix:
#     print(M)
dijkstra()
# for M in dist:
#     print(M)
print(dist[N-1][N-1])