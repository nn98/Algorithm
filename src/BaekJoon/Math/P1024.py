import sys

n, l = map(int, sys.stdin.readline().split())

while True:
    const = 0
    first = 0

    for i in range(1, l):
        const += i
    first = (n - const) / l

    if first == int(first) and first >= 0:
        for i in range(l):
            print(int(first + i), end=' ')
        exit(0)
    else:
        if l == 100:
            print(-1)
            exit(0)
        else:
            l += 1
