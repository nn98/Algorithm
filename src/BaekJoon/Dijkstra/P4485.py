import sys
import heapq
readline = sys.stdin.readline

next_x = [0,1,0,-1]
next_y = [1,0,-1,0]

CASE = int(readline())
while CASE:
    matrix = [list(map(int,readline().split())) for _ in range(CASE)]
    print(matrix)
    visited = [[0] * CASE for _ in range(CASE)]
    q = []
    heapq.heappush(q,(0,0,matrix[0][0]))
    while q:
        x, y, dist = heapq.heappop(q)
        print(x,y,dist)
        if visited[x][y] != 0 and visited[x][y] < dist: continue
        visited[x][y] = dist
        for i in range(4):
            nX = x + next_x[i]
            nY = y + next_y[i]
            if 0 <= nX < CASE and 0 <= nY < CASE:
                if visited[nX][nY] == 0 or (visited[nX][nY] != 0 and visited[nX][nY] > dist + matrix[nX][nY]):
                    heapq.heappush(q, (nX, nY, dist + matrix[nX][nY]))
    print('\n'.join(map(str, visited)))
    CASE = int(readline())
