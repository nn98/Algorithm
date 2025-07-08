import sys
from collections import deque

next_index = [(0,1),(1,0),(1,1)]
move_case = [(0,2),(1,2),(0,1,2)]

readline = sys.stdin.readline

def main():
    n = int(readline())
    home = [readline().split() for _ in range(n)]
    dp = [[[0] * n for _ in range(n)] for _ in range(3)]
    dp[0][0][1] = 1   # (0,1)에 가로 방향으로 시작
    q = deque()
    q.append((0,1,0))
    while q:
        x, y, case = q.popleft()
        for next_x, next_y, next_case in get_next(home, x, y, case):
            dp[next_case][next_x][next_y] += dp[case][x][y]
            q.append((next_x, next_y, next_case))
    print(dp[0][n-1][n-1] + dp[1][n-1][n-1] + dp[2][n-1][n-1])

def get_next(home, x, y, case):
    n = len(home)
    result = []
    for move in move_case[case]:
        x_move, y_move = next_index[move]
        nx = x + x_move
        ny = y + y_move
        if nx >= n or ny >= n:
            continue
        if move == 2:
            if x >= 0 and y >= 0 and nx-1 >= 0 and ny-1 >= 0:
                if home[nx][ny] == '0' and home[nx-1][ny] == '0' and home[nx][ny-1] == '0':
                    result.append((nx, ny, move))
        else:
            if home[nx][ny] == '0':
                result.append((nx, ny, move))
    return result

if __name__ == "__main__":
    main()
