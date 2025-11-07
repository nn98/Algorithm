import sys

readline = sys.stdin.readline

n = int(readline())
arr = list(map(int, readline().split()))

dp = [0] * n

dp[0] = 1

for i in range(1, n):
    j = i
    max_val = 0
    while j > 0:
        j -= 1
        if arr[j] < arr[i]:
            max_val = max(max_val, dp[j])
    dp[i] = max_val + 1

print(max(dp))