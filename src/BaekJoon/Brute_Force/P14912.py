n, digit = map(int, input().split())

count = 0

for i in range(1, n+1):

    for a in str(i):
        if int(a) == digit:
            count += 1

print(count)
