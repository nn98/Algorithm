N = int(input())
M = int(input())
p = [-int(input()) for _ in range(N)]
fs = [(i, int(input())) for i in range(N)]

fs.sort(key=lambda x: x[1])

check = [False] * N

def find(x):
    if p[x] < 0:
        return x
    p[x] = find(p[x])
    return p[x]

def union(x, y):
    a = find(x)
    b = find(y)
    if a == b:
        return
    p[a] += p[b]
    p[b] = a

for i in range(N):
    x, s = fs[i]
    check[x] = True

    if x > 0 and check[x - 1]:
        union(x, x - 1)
    if x < N - 1 and check[x + 1]:
        union(x, x + 1)

    if -p[find(x)] >= M:
        print(s)
        break
