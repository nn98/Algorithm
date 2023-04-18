n, t = map(int, input().split())
t %= (4 * n - 2)
print(n, t)
if t <= n * 2:
    print(t)
else:
    print(n * 2 - (t - n * 2))
