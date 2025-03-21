import sys

readline = sys.stdin.readline

N, K = map(int, readline().split())
jewels = []
bags = []
for i in range(N):
    a, b = map(int, readline().split())
    jewels.append([a, b])
for i in range(K):
    a, b = map(int, readline().split())
    bags.append([a, b])
jewels.sort(key=lambda x: (x[1], x[0]))
bags.sort()
print(jewels)
print(bags)
