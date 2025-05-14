import sys

readline = sys.stdin.readline
n, k = map(int,readline().split())
arr = list(map(int,readline().split()))

cnt = [[0,0] for _ in range(k)]
dp = [[0,0] for _ in range(k)]

print('cnt',cnt)
for i in range(n):
    idx = i%k
    cnt[idx][arr[i]%2] += 1
print('cnt',cnt)

dp[0][0] = cnt[0][1]
dp[0][1] = cnt[0][0]
for i in range(1,k):
    dp[i][0] = min(dp[i-1][1] + cnt[i][0], dp[i-1][0] + cnt[i][1])
    dp[i][1] = min(dp[i-1][1] + cnt[i][1], dp[i-1][0] + cnt[i][0])
print('dp',dp)
