import sys
readline = sys.stdin.readline

N = int(readline())
carriage = list(map(int,readline().split()))
M = int(readline())

head = 0
pre_sum = [0] * N
pre_sum[0] = carriage[0]
for i in range(1, N):
    for j in range(0, M):
        idx = i - j
        if idx < 0:
            break
        pre_sum[idx] += carriage[i]

print(carriage)
print(pre_sum)
