import sys
readline = sys.stdin.readline
n = int(readline())

arr = [0] * (10**9)
ans = 0
for i in range(n):
    a, b = map(int, readline().split())
    for i in range(a,b):
        arr[i] += 1
    

