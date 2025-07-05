import sys
from collections import deque
readline = sys.stdin.readline

def main():
    n, m = map(int,readline().split())
    ans = 0
    treasure = [readline().strip() for _ in range(n)]
    hist = [[1e9]*m for _ in range(n)]
    for i in range(n):
        for j in range(m):
            if treasure[i][j] == 'L' and hist[i][j] == 1e9:
                ans = max(ans, bfs(treasure, i, j, hist, 0))
    print(ans)

def bfs(treasure, i, j, hist, long):
    X = [0,1,0,-1]
    Y = [1,0,-1,0]
    max_data = (0, i, j)
    hist[i][j] = 0
    q = deque()
    q.append((0, i, j))
    while q:
        dist, x, y = q.popleft()
        if hist[x][y] < dist:
            continue
        if dist > max_data[0]:
            max_data = (dist, x, y)
        dist += 1
        for i in range(4):
            next_x = x + X[i]
            next_y = y + Y[i]
            print(next_x, next_y, len(treasure), len(treasure[0]))
            if 0 <= next_x < len(treasure) and 0 <= next_y < len(treasure[0]) and treasure[next_x][next_y]:
                if hist[next_x][next_y] > dist:
                    hist[next_x][next_y] = dist
                    q.append((dist, next_x, next_y))
    return max_data if max_data[0] >= long else bfs(treasure, max_data[1], max_data[2], [[1e9]*len(treasure[0]) for _ in range(len(treasure))], max_data[0])

if __name__ == "__main__":
    main()
