import sys
from collections import deque

readline = sys.stdin.readline

N, T = map(int, readline().split())
times = list(map(int, readline().split()))
time = 0
count = -1
q = deque()
q.extend(times)
ans = [0] * N
while q:
    count += 1
    count %= N
    if count % N == 0: print(q)
    now = q.popleft()
    if now == 0: continue
    isSolve = now <= T
    if isSolve:
        time += now
        ans[count] = time
        now = 0
    else:
        time += T
        now -= T
    q.append(now)

print(ans)