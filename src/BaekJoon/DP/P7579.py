import sys

readline = sys.stdin.readline

n, m = map(int, readline().split())

memory = list(map(int, readline().split()))
cost = list(map(int, readline().split()))

max_cost = sum(cost)

dp = [[0] * (max_cost + 1) for _ in range(n + 1)]

answer = 1e9

for i in range(1, n + 1):
    for j in range(1, max_cost + 1):
        if cost[i-1] > j:
            dp[i][j] = dp[i-1][j]
        else:
            dp[i][j] = max(dp[i-1][j-cost[i-1]] + memory[i-1], dp[i-1][j])
        if dp[i][j] >= m:
            answer = min(answer, j)

print(answer)
