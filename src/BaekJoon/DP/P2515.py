import sys
readline = sys.stdin.readline

def sol(idx, hei, val):
    hei = pics[idx][0]
    val += pics[idx][1]
    dp[idx] = val
    for i in range(idx, -1,-1):
        if pics[i][0] <= hei - S and dp[i] < val+pics[i][1]:
            sol(i, hei, val)

N, S = map(int, readline().split())
pics = []
for _ in range(N):
    height, value = map(int, readline().split())
    pics.append((height, value))
pics.sort(key=lambda x: (x[0], -x[1]))
print(pics)
dp = [0] * len(pics)
# his = [False] * len(pics)

for i in range(N-1, -1, -1):
    if dp[i] < pics[i][1]:
        sol(i, pics[i][0], 0)

print(max(dp))
