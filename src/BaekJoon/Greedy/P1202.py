import sys
import heapq
readline = sys.stdin.readline

N, K = map(int, readline().split())
jewels = []
bags = []

for i in range(N):
    a, b = map(int, readline().split())
    jewels.append([a, b])
for i in range(K):
    bags.append(int(readline()))
jewels.sort()
bags.sort()
# print(jewels)
# print(bags)

q = []
ans = 0
for bag in bags:
    while jewels and jewels[0][0] <= bag:
        heapq.heappush(q, -jewels[0][1])
        heapq.heappop(jewels)
    if q:
        ans -= heapq.heappop(q)
print(ans)
