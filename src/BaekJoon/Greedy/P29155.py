import sys
readline = sys.stdin.readline
n = int(readline())
problems = list(map(int,readline().split()))
solveTime = [[] for _ in range(5)]
for i in range(n):
    rank, time = map(int, readline().split())
    solveTime[rank-1].append(time)

for i in range(5):
    solveTime[i].sort()

ans = 0
for i in range(5):
    past = 0
    while problems[i]:
        nowSolve = solveTime[i].pop(0)
        ans += (nowSolve if past == 0 else nowSolve + nowSolve - past)
        problems[i] -= 1
        past = nowSolve
    ans += 60

print(ans-60)
