import sys

readline = sys.stdin.readline
n, k = map(int,readline().split())
arr = list(map(int,readline().split()))
i, j = 0, 0 + k - 1
now = sum(arr[:k])
ans = 0
while j < n:
    if now % 2 == 1:
        arr[j] += 1
        now += 1
        ans += 1
    else:
        if j == n-1: break;
        now -= arr[i]
        i += 1
        j += 1
        now += arr[j]
print(ans)
