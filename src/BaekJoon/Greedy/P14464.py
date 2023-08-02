import sys

C, N = map(int, sys.stdin.readline().rstrip().split())
chickens = [int(sys.stdin.readline().rstrip()) for _ in range(C)]
chickens = sorted(chickens)

cows = [list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(N)]
cows = sorted(cows, key=lambda x: (x[1], x[0]))

visited = [0 for _ in range(C)]

ans = 0
for s, e in cows:
    for idx, value in enumerate(chickens):
        if s <= value <= e and visited[idx] == 0:
            ans += 1
            visited[idx] = 1
            break
print(ans)
