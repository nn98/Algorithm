import sys
import heapq
readline=sys.stdin.readline

def dijkstra():
    dist[0][0] = 0
    q=[]
    heapq.heappush(q,(0,0,0))
    while q:
        value, x, y = heapq.heappop(q)
        if dist[x][y] < value:
            continue
        for i in range(4):
            nextX = x + index[0][i]
            nextY = y + index[1][i]
            if nextX < 0 or nextX >= n or nextY < 0 or nextY >= m:
                continue
            nextValue = value + matrix[nextX][nextY]
            if dist[nextX][nextY] > nextValue:
                dist[nextX][nextY] = nextValue
                heapq.heappush(q, (nextValue, nextX, nextY))

m, n = map(int,readline().split())
matrix = []
index = [[0,1,0,-1], [1,0,-1,0]]
INF = int(1e9)
dist = [[INF]*m for _ in range(n)]
for i in range(n):
    matrix.append(list(map(int,readline().replace('\n',''))))

dijkstra()
print(dist[n-1][m-1])