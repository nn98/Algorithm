import sys
readline = sys.stdin.readline

N = int(readline())
weights = list(map(int, readline().split()))
weights.sort()

cur_max = 0
for weight in weights:
    if weight > cur_max+1:
        print(cur_max+1)
        exit(0)
    cur_max += weight

print(cur_max+1)
