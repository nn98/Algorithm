from sys import stdin

input = stdin.readline
data = list(map(int, input().rstrip()))
len = len(data)

dp = [0] * (len + 1)
dp[0] = 1  # 1번 인덱스의 1자리수 경우 구할 때 필요
dp[1] = 1

if data[0] == 0:
    print(0)
else:
    for k in range(1, len):
        i = k + 1  # dp용 인덱스
        if data[k] > 0:  # 1자리 허용
            dp[i] += dp[i-1]
        if 10 <= data[k] + data[k-1]*10 <= 26:  # 2자리 허용, dp[i-1]이 0일 수도 있다.
            dp[i] += dp[i-2]
    print(dp[len] % 1000000)
