import sys

readline = sys.stdin.readline

n = int(readline())
arr = list(map(int, readline().split()))

dp = [0] * n

dp[0] = 1

for i in range(1, n):
    j = i - 1
    while j >= 0 and arr[j] >= arr[i]:
        j -= 1
    if j < 0:
        dp[i] = 1
    else:
        dp[i] = dp[j] + 1

print(dp)
print(max(dp))