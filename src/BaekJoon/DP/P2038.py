import sys

n = int(sys.stdin.readline())
dp = [0, 1]
sum_ = 1
i = 2
while sum_ < n:
    dp.append(1 + dp[i - dp[dp[i-1]]])
    sum_ += dp[i]
    i += 1

print(i - 1)
