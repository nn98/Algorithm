import sys
input = sys.stdin.readline

# x, y : 각 좌표
x, y = map(int, input().split())

total = 1
if x > 0 :
    for i in range(1, x + 1):
        total += (6 * i)
    if y < 0:
        if abs(y) <= x:
            total += y
        else:
            total -= x
            for i in range(x, abs(y)):
                total += 4 + (6 * i)
    elif y > 0:
        total += 1
        if y == 1:
            pass
        else:
            for i in range(0, y - 1):
                total += 7 + (6 * (x + i))
elif x < 0:
    for i in range(1, abs(x) + 1):
        total += ((i * 2) - 1) * 3
    if y < 0:
        for i in range(abs(y)):
            total += (4 + ((abs(x) + i) * 6))
    elif y > 0:
        if y <= abs(x):
            total -= y
        else:
            total += x
            for i in range(y - abs(x)):
                total += 1 + ((abs(x) + i) * 6)
elif x == 0:
    if y < 0:
        sum_v = 4
        for i in range(abs(y)):
            total += (sum_v + (i * 6))
    elif y > 0:
        sum_v = 1
        for i in range(y):
            total += (sum_v + (i * 6))
print(total)
