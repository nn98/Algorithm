import sys

# 입력부
n = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))

# val : 배열의 최대값
val = max(arr)

# check : 현재 숫자가 배열에 존재하지 않으면 -1, 존재하면 그 인덱스를 저장하는 배열
check = [-1] * (val + 1)
for i in range(n):
    check[arr[i]] = i
    
# dp : 현재 i번째 인덱스에서 시작하여 j번째 인덱스를 밟을 때 얻는 최대값을 저장하는 상태 공간
dp = [[0] * n for _ in range(n)]

# 초기화
for i in range(n):
    for j in range(i + 1, n):
        diff = abs(arr[i] - arr[j])
        # 현재 끝나는 지점에서 간격만큼의 수가 있다면 (최소 3개를 밟을 수 있다면) 초기화
        if arr[j] + diff <= val and check[arr[j] + diff] != -1:
            dp[i][j] = arr[i] + arr[j]

# 점화식
for i in range(n - 1):
    for j in range(n):
        # 현재 상태가 가능하다면
        if dp[i][j]:
            diff = abs(arr[i] - arr[j])
            # 그 다음 타일을 밟을 수 있다면 채운다
            if arr[j] + diff <= val and check[arr[j] + diff] != -1:
                dp[j][check[arr[j] + diff]] = max(dp[j][check[arr[j] + diff]], dp[i][j] + arr[check[arr[j] + diff]])

# 정답 출력
ans = 0
for i in dp:
    ans = max(ans, max(i))

print(ans)
