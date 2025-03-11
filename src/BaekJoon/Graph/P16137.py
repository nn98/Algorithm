import sys
import heapq
readline = sys.stdin.readline

def find_cross(grid, n):
    X = [0,1,0,-1]
    Y = [1,0,-1,0]
    result = []
    for i in range(n):
        for j in range(n):
            if grid[i][j] >= 1: continue
            neighbor = 0
            for k in range(4):
                next_x = i + X[k]
                next_y = j + Y[k]
                if 0 <= next_x < n and 0 <= next_y < n:
                    neighbor += 1 if grid[next_x][next_y] == 1 else 0
            if neighbor >= 2: result.append((i, j))
    return result

def bfs(n, grid):
    INF = float('inf')
    dirs = [(-1,0), (1,0), (0,-1), (0,1)]
    # visited[x][y][0/1]: 해당 칸, 직전 오작교 사용 여부 별 최소 시간
    visited = [[[INF]*2 for _ in range(n)] for __ in range(n)]
    heap = []
    heapq.heappush(heap, (0, 0, 0, False))  # (시간, x, y, 직전 오작교 사용여부)
    visited[0][0][0] = 0

    while heap:
        time, x, y, last_used = heapq.heappop(heap)
        if x == n-1 and y == n-1:
            return time
        if time > visited[x][y][last_used]:
            continue
        for dx, dy in dirs:
            nx, ny = x+dx, y+dy
            if 0 <= nx < n and 0 <= ny < n:
                cell = grid[nx][ny]
                if cell == 0:
                    continue
                if cell == 1:
                    new_time = time + 1
                    new_last = False
                else:
                    if last_used:
                        continue  # 연속 오작교 불가
                    K = cell
                    # 오작교가 열리는 시점까지 기다림
                    if (time % K) == K-1:
                        new_time = time + 1
                    else:
                        next_act = ((time // K) + 1) * K - 1
                        new_time = next_act + 1
                    new_last = True
                if new_time < visited[nx][ny][new_last]:
                    visited[nx][ny][new_last] = new_time
                    heapq.heappush(heap, (new_time, nx, ny, new_last))
    return INF

n, m = map(int, readline().split())
grid = [list(map(int, readline().split())) for _ in range(n)]
candidates = find_cross(grid, n)
min_time = float('inf')

for pos in candidates:
    x, y = pos
    new_grid = [row[:] for row in grid]
    new_grid[x][y] = m
    result = bfs(n,new_grid)
    min_time = min(min_time, result)

print(min_time)