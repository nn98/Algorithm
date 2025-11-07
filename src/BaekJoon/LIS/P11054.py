import sys

readline = sys.stdin.readline

n = int(readline())
arr = list(map(int, readline().split()))

dp_asc = [0] * n
dp_desc = [0] * n

dp_asc[0] = 1
dp_desc[n-1] = 1

for i in range(1, n):
    j = i
    asc_max_val = 0
    while j > 0:
        j -= 1
        if arr[j] < arr[i]:
            asc_max_val = max(asc_max_val, dp_asc[j])
    dp_asc[i] = asc_max_val + 1

for i in range(n-2, -1, -1):
    j = i
    desc_max_val = 0
    while j < n-1:
        j += 1
        if arr[j] < arr[i]:
            desc_max_val = max(desc_max_val, dp_desc[j])
    dp_desc[i] = desc_max_val + 1

# print(dp_asc)
# print(dp_desc)

answer = 0

for i in range(n):
    left = dp_asc[i]
    right = 0
    for j in range(i, n):
        if arr[i] > arr [j]:
            right = max(right, dp_desc[j])
    answer = max(answer, left + right)

print(answer)
