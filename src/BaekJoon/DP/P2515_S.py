import sys
import bisect

readline = sys.stdin.readline

N, S = map(int, readline().split())
pics = []
for _ in range(N):
    h, v = map(int, readline().split())
    pics.append((h, v))

# 높이 오름차순, 가치 내림차순 정렬
pics.sort(key=lambda x: (x[0], -x[1]))
heights = [h for h, v in pics]
values = [v for h, v in pics]

dp = [0] * N
max_dp = [0] * (N + 1)  # max_dp[i]: 0~i-1까지의 최대 dp 값

for i in range(N):
    # 현재 사진의 높이 - S 이상인 가장 왼쪽 인덱스 찾기
    target = pics[i][0] - S
    left = bisect.bisect_right(heights, target) - 1

    if left < 0:
        dp[i] = values[i]
    else:
        dp[i] = max_dp[left + 1] + values[i]

    # max_dp 갱신
    max_dp[i + 1] = max(max_dp[i], dp[i])
    # print('dp:\t',dp)
    # print('max_dp:\t',max_dp)

print(max_dp[N])
