import sys
readline = sys.stdin.readline

N = int(readline())
carriage = list(map(int,readline().split()))
M = int(readline())

pre_sum = [0] * (N+1)
for i in range(1, N+1):
    pre_sum[i] = carriage[i-1] + pre_sum[i-1]

dp = [[0] * 4 for _ in range(N+1)]
for j in range(1, 4):
    for i in range(M, N+1):
        dp[i][j] = max(dp[i-1][j], dp[i-M][j-1] + pre_sum[i] - pre_sum[i-M])

print(dp[N][3])
