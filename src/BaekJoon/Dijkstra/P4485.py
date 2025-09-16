import sys
import heapq
readline = sys.stdin.readline

count = 0
next_x = [0,1,0,-1]
next_y = [1,0,-1,0]

CASE = int(readline())
while CASE:
    count+=1
    matrix = [list(map(int,readline().split())) for _ in range(CASE)]
    # print(matrix)
    visited = [[1e9] * CASE for _ in range(CASE)]
    q = []
    heapq.heappush(q,(matrix[0][0],0,0))
    while q:
        dist, x, y = heapq.heappop(q)
        if visited[x][y] < dist: continue
        if x == CASE-1 and y == CASE-1: break
        # print(x,y,dist)
        visited[x][y] = dist
        for i in range(4):
            nX = x + next_x[i]
            nY = y + next_y[i]
            if 0 <= nX < CASE and 0 <= nY < CASE:
                if visited[nX][nY] > dist + matrix[nX][nY]:
                    visited[nX][nY] = dist + matrix[nX][nY]
                    heapq.heappush(q, (dist + matrix[nX][nY], nX, nY))
    # print('\n'.join(map(str, visited)))
    print('Problem %d: %d' % (count,visited[CASE-1][CASE-1]))
    CASE = int(readline())
