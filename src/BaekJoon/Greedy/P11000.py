import sys
import heapq
readline = sys.stdin.readline
n = int(readline())
q = []
for i in range(n):
    a, b = map(int, readline().split())
    heapq.heappush(q, [a, b])