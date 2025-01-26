import sys
readline = sys.stdin.readline

n = int(readline())
home = [readline().split() for _ in range(n)]
dp = [[[0]*3 for _ in range(n)] for _ in range(n)]

# 시작 위치: (0,1) 가로 방향(0)
dp[0][1][0] = 1

for x in range(n):
    for y in range(n):
        # 가로
        if dp[x][y][0]:
            # 가로로 이동
            if y+1 < n and home[x][y+1] == '0':
                dp[x][y+1][0] += dp[x][y][0]
            # 대각선 이동
            if x+1 < n and y+1 < n and home[x][y+1] == home[x+1][y] == home[x+1][y+1] == '0':
                dp[x+1][y+1][2] += dp[x][y][0]
        # 세로
        if dp[x][y][1]:
            # 세로로 이동
            if x+1 < n and home[x+1][y] == '0':
                dp[x+1][y][1] += dp[x][y][1]
            # 대각선 이동
            if x+1 < n and y+1 < n and home[x][y+1] == home[x+1][y] == home[x+1][y+1] == '0':
                dp[x+1][y+1][2] += dp[x][y][1]
        # 대각선
        if dp[x][y][2]:
            # 가로로 이동
            if y+1 < n and home[x][y+1] == '0':
                dp[x][y+1][0] += dp[x][y][2]
            # 세로로 이동
            if x+1 < n and home[x+1][y] == '0':
                dp[x+1][y][1] += dp[x][y][2]
            # 대각선 이동
            if x+1 < n and y+1 < n and home[x][y+1] == home[x+1][y] == home[x+1][y+1] == '0':
                dp[x+1][y+1][2] += dp[x][y][2]

print(sum(dp[n-1][n-1]))
