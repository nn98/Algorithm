import sys
readline = sys.stdin.readline

next_X = [0,1,0,-1]
next_Y = [1,0,-1,0]

def main():
    n = int(readline())
    area = [list(map(int,readline().split())) for _ in range(n)]
    min_val = min(map(min,area))
    before = 1
    answer = 1
    while True:
        now = 0
        visit = [[False] * n for _ in range(n)]
        for i in range(n):
            for j in range(n):
                if area[i][j] > min_val and not visit[i][j]:
                    bfs(area, n, i, j, visit, min_val)
                    now += 1
        if now < answer: break
        before = now
        answer = max(answer, now)
        min_val += 1
    print(before)

def bfs(area, n, x, y, visit, min_val):
    visit[x][y] = True
    for i in range(4):
        new_x = x + next_X[i]
        new_y = y + next_Y[i]
        if 0 <= new_x < n and 0 <= new_y < n and area[new_x][new_y] > min_val and not visit[new_x][new_y]:
            bfs(area, n, new_x, new_y, visit, min_val)

if __name__ == "__main__":
    main()
