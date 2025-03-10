import sys
readline = sys.stdin.readline

def find_cross(grid, n):
    X = [0,1,0,-1]
    Y = [1,0,-1,0]
    finded = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if grid[i][j] >= 1: continue
            neighbor = 0
            for k in range(4):
                next_x = i + X[k]
                next_y = j + Y[k]
                if 0 <= next_x < n and 0 <= next_y < n:
                    neighbor += 1 if grid[next_x][next_y] == 1 else 0
            if neighbor >= 2: finded[i][j] = 1
    return finded

n, m = map(int, readline().split())
grid = [list(map(int, readline().split())) for _ in range(n)]
finded = find_cross(grid, n)
print()
print('\n'.join(' '.join(map(str, grid[i])) for i in range(n)))
print()
print('\n'.join(' '.join(map(str, finded[i])) for i in range(n)))
print()