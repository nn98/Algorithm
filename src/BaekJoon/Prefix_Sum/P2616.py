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

history = [-1e9] * N
def sol(idx, sum, remain):
    if history[idx] >= sum:
        return
    history[idx] = sum
    if remain == 0 or idx >= N:
        global max_val
        max_val = max(max_val, sum)
    sol(idx+1, sum, remain)

    sum += pre_sum[idx]
    if idx < N-1:
        temp = pre_sum[idx+1]
        pre_sum[idx+1] = 0
    sol(idx+1, sum, remain-1)
    if idx < N-1:
        pre_sum[idx+1] = temp

max_val = 0
sol(0,0,3)

print(carriage)
print(pre_sum)
print(max_val)
