import sys

read = sys.stdin.readline

n, M = map(int, read().split())
mem = list(map(int, read().split()))
cost = list(map(int, read().split()))

Cmax = sum(cost)
# dp[c] = 비용 c로 얻을 수 있는 최대 메모리
dp = [0] * (Cmax + 1)

for i in range(n):
    mi = mem[i]
    ci = cost[i]
    # 0/1 배낭: 비용 역순 갱신
    for c in range(Cmax, ci - 1, -1):
        # 아이템 i를 쓰는 경우와 안 쓰는 경우 중 최대 메모리 갱신
        cand = dp[c - ci] + mi
        if cand > dp[c]:
            dp[c] = cand

# 최소 비용 찾기
ans = next(c for c, v in enumerate(dp) if v >= M)
print(ans)
