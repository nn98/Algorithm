import sys

readline = sys.stdin.readline

n = int(readline())
arr = list(map(int, readline().split()))

dp_asc = [0] * n
dp_desc = [0] * n

dp_asc[0] = 1
dp_desc[0] = 1

for i in range(1, n):
    j = i
    asc_max_val = 0
    desc_max_val = 0
    while j > 0:
        j -= 1
        if arr[j] < arr[i]:
            asc_max_val = max(asc_max_val, dp_asc[j])
        if arr[j] > arr[i]:
            desc_max_val = max(desc_max_val, dp_desc[j])

    dp_asc[i] = asc_max_val + 1
    dp_desc[i] = desc_max_val + 1

print(dp_asc)
print(dp_desc)
