import sys
import heapq
readLine = sys.stdin.readline
matrix = [[0] * 501 for _ in range(501)]
X = [-1,0,1,0]
Y = [0,-1,0,1]
INF = int(1e9)
dist = [[INF] * 501 for _ in range(501)]
for _ in range(int(readLine())):
    x1, y1, x2, y2 = map(int,readLine().split())
    if x1 > x2:
        t = x1
        x1 = x2
        x2 = t
    if y1 > y2:
        t = y1
        y1 = y2
        y2 = t
    for i in range(x1, x2+1):
        for j in range(y1, y2+1):
            matrix[i][j]=1
for _ in range(int(readLine())):
    x1, y1, x2, y2 = map(int,readLine().split())
    if x1 > x2:
        t = x1
        x1 = x2
        x2 = t
    if y1 > y2:
        t = y1
        y1 = y2
        y2 = t
    for i in range(x1, x2+1):
        for j in range(y1, y2+1):
            matrix[i][j]=2
q = []
heapq.heappush(q,(0,0,0))
dist[0][0] = 0
while(q):
    nowC, nowX, nowY = heapq.heappop(q)
    # print(nowX,nowY,nowC)
    if dist[nowX][nowY] < nowC: continue
    for i in range(4):
        newX = nowX+X[i]
        newY = nowY+Y[i]
        if newX < 0 or newY < 0 or newX > 500 or newY > 500: continue
        if matrix[newX][newY] == 2: continue
        newC = matrix[newX][newY] + nowC
        if newC < dist[newX][newY]:
            dist[newX][newY] = newC
            heapq.heappush(q,(newC,newX,newY))
# for a in dist:
#     print(a)
print(dist[500][500] if dist[500][500] != INF else -1)