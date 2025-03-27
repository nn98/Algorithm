import sys
readline = sys.stdin.readline

N = int(readline())
tasks = []
for i in range(N):
    a, b = map(int, readline().split())
    tasks.append([a, b])

tasks.sort(key = lambda x: (-x[1], x[0]))
his = [0] * (N + 1)
his[0] = 1
ans = 0
for time, score in tasks:
    while his[time]:
        time -= 1
        if time < 0: break
    if time >= 0 and his[time] < 1:
        his[time] = 1
        ans += score
print(ans)
