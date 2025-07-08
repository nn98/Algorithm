import sys
from collections import deque

next_index = [(0,1),(1,0),(1,1)]
move_case = [(0,2),(1,2),(0,1,2)]

readline = sys.stdin.readline

def main():
    n = int(readline())
    home = [readline().split() for _ in range(n)]
    dp = [[[0] * n for _ in range(n)] for _ in range(3)]
    dp[0][0][1] = 1
    print(dp)
    ans = 0
    q = deque()
    q.append((0,1,0))
    while q:
        x, y, case = q.popleft()
        if x == n-1 and y == n-1:
            continue
        else:
            for next_x, next_y, next_case in get_next(home, x, y, case):
                print(next_x, next_y, next_case)
                dp[next_case][next_x][next_y] += dp[case][x][y]
                q.append((next_x, next_y, next_case))
    print(dp[0][n-1][n-1] + dp[1][n-1][n-1] + dp[2][n-1][n-1])
    # print()

def get_next(home, x, y, case):
    result = []
    for move in move_case[case]:
        x_move, y_move = next_index[move]
        x_move += x
        y_move += y
        if x_move < len(home) and y_move < len(home) and (home[x_move-1][y_move] == home[x_move][y_move-1] == home[x_move][y_move] == '0' if move == 2 else home[x_move][y_move] == '0'):
            result.append((x_move, y_move, move))
    return result

if __name__ == "__main__":
    main()
