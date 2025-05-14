n, k = map(int, input().split())
arr = list(map(int, input().split()))
add = [0] * (n+1)
ans = 0
s = 0

for i in range(n-k+1):
    s += add[i]
    # print('s:',s,' add:',add)
    if (arr[i] + s) % 2 == 1:
        ans += 1
        s += 1
        if i + k < n:
            add[i + k] -= 1

print(ans)
