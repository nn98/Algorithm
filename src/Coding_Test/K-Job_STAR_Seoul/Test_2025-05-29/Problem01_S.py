import sys

N, K = map(int, sys.stdin.readline().split())
time = [int(sys.stdin.readline()) for _ in range(N)]
time.sort()

if N == 0:
    print(0)
    exit()

# 간격 계산 (첫 시간 제외)
gaps = []
for i in range(1, N):
    gaps.append(time[i] - time[i-1])

# K-1개 최대 간격 제거
if K == 1:
    print(time[-1] - time[0])
    exit()

gaps.sort(reverse=True)
remove_sum = sum(gaps[:K-1])

total = time[-1] - time[0] - remove_sum
print(total)
