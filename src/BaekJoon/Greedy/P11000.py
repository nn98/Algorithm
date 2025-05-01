import sys
import heapq
readline = sys.stdin.readline
n = int(readline())
q = []
arr = []
for i in range(n):
    arr.append(tuple(map(int,readline().rstrip().split())))

arr.sort(key=lambda x:(x[0], x[1]))
ans = 0
count = 0
for i in range(n):
    heapq.heappush(q,arr[i][1])
    if q[0] <= arr[i][0]: heapq.heappop(q);

print(len(q))
