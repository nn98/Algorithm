import sys
from collections import deque
readline = sys.stdin.readline

next_X = [0,1,0,-1]
next_Y = [1,0,-1,0]

def main():
    n = int(readline())
    area = [list(map(int,readline().split())) for _ in range(n)]
    min_val = min(map(min,area))
    before = 1
    answer = 1
    q = deque()
    while True:
        now = 0
        visit = [[False] * n for _ in range(n)]
        for i in range(n):
            for j in range(n):
                if area[i][j] > min_val and not visit[i][j]:
                    q.append((i,j))
                    now += 1
                    while q:
                        x, y = q.popleft()
                        visit[x][y] = True
                        for k in range(4):
                            new_x = x + next_X[k]
                            new_y = y + next_Y[k]
                            if 0 <= new_x < n and 0 <= new_y < n and area[new_x][new_y] > min_val and not visit[new_x][new_y]:
                                q.append((new_x,new_y))
        if now < before:
            break
        before = now
        answer = max(answer, now)
        min_val += 1
    print(answer)

if __name__ == "__main__":
    main()
