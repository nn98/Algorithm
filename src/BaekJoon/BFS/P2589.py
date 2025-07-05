import sys
from collections import deque
readline = sys.stdin.readline

def main():
    n, m = map(int,readline().split())
    ans = 0
    treasure = [readline().strip() for _ in range(n)]
    for i in range(n):
        for j in range(m):
            if treasure[i][j] == 'L':
                hist = [[1e9]*m for _ in range(n)]
                ans = max(ans, bfs(treasure, i, j, hist))
    print(ans)

def bfs(treasure, i, j, hist):
    X = [0,1,0,-1]
    Y = [1,0,-1,0]
    max_data = 0
    hist[i][j] = 0
    q = deque()
    q.append((0, i, j))
    while q:
        dist, x, y = q.popleft()
        if hist[x][y] < dist:
            continue
        if dist > max_data:
            max_data = dist
        dist += 1
        for k in range(4):
            next_x = x + X[k]
            next_y = y + Y[k]
            if 0 <= next_x < len(treasure) and 0 <= next_y < len(treasure[0]) and treasure[next_x][next_y] == 'L':
                if hist[next_x][next_y] > dist:
                    hist[next_x][next_y] = dist
                    q.append((dist, next_x, next_y))
    return max_data

if __name__ == "__main__":
    main()
