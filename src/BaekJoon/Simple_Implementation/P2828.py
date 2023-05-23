import sys
input = sys.stdin.readline

n, m = map(int, input().split())
m -= 1
j = int(input())

res = 0
loc = 1
for _ in range(j):
    x = int(input())
    if x < loc:
        res += (loc - x)
        loc = x
    elif loc <= x < loc+m:
        pass
    else:
        res += (x-m) - loc
        loc = x-m
print(res)
