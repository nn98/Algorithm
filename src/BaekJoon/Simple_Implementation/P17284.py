m = 5000
for n in map(int, input().split()):
    if n == 1:
        m -= 500
    elif n == 2:
        m -= 800
    else:
        m -= 1000
print(m)