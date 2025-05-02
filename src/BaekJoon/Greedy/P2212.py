import sys

readline = sys.stdin.readline

N = int(readline())
K = int(readline())
arr = list(map(int, readline().split()))

arr.sort()
dist = []

for i in range(1, N):
    dist.append(arr[i] - arr[i - 1])
dist.sort()
print(sum(dist[:N - K]))
