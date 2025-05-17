# DP, 색종이문제? 시간초과날듯ㅋㅋㅅ

# DP로 가능할거같은데
# 행번호가 우선이니 아래로 내려가면서 dp[x-1][y] + arr[x][y], 1이면 -1
# zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz
import sys
readline = sys.stdin.readline
def main():
    r, c = map(int,readline().split())
    arr = [[] for _ in range(r+1)]
    dp = [[] for _ in range(r+1)]
    arr[0] = [1] * (c+1)
    dp[0] = [0] * (c+1)
    for i in range(1,r+1):
        arr[i].append(1)
        dp[i].append(0)
        inputline = list(map(int,readline().split()))
        for j in range(1,c+1):
            arr[i].append(inputline[j-1])
            if arr[i][j] == 1:
                dp[i].append(0)
            else:
                dp[i].append(1 if dp[i][j-1] == 0 else dp[i][j-1]+1)

    # for i in arr:
    #     print(i)
    # print()
    # for i in dp:
    #     print(i)

    ans = 0
    ANS = [0,0]
    for i in range(1,r+1):
        for j in range(1, c+1):
            if dp[i][j] > 0:
                # print('i',i,'j',j)
                target = dp[i][j]
                to = i-1
                while dp[to][j] > 0 and to > 0:
                    target = min(target, dp[to][j])
                    value = (i - to + 1) * target
                    if value > ans :
                        ans = value
                        ANS[0] = to
                        ANS[1] = j-target+1

                    # print('i:',i,'j:',j,'to:',to,'target:',target,'value:',value,'ans:',ans)
                    to-=1

    print(ans)
    print(ANS[0],ANS[1])

if __name__=="__main__":
    main()

# 8 11
# 1 0 1 0 0 0 1 0 1 0 0
# 0 0 1 0 1 0 0 0 0 1 0
# 0 0 0 0 0 0 0 0 0 0 0
# 0 0 0 1 0 1 0 0 0 0 0
# 0 0 0 0 0 0 0 0 0 0 0
# 0 0 0 0 0 0 0 0 0 0 0
# 1 1 1 1 1 1 1 1 1 1 1
# 0 0 0 0 0 0 0 0 0 0 0

# 8 11
# 1 0 1 0 0 0 1 0 1 0 0
# 0 0 1 0 1 0 0 0 0 0 0
# 0 0 0 0 0 0 0 0 0 0 0
# 0 0 0 1 0 1 0 0 0 0 0
# 0 0 0 0 0 0 0 0 0 0 0
# 0 0 0 0 0 0 0 0 0 0 0
# 1 1 1 1 1 1 1 1 1 1 1
# 0 0 0 0 0 0 0 0 0 0 0


# arr = [[] for _ in range(r+1)]
# dp = [[] for _ in range(r+1)]
# arr[0] = [1] * (c+1)
# dp[0] = [0] * (c+1)
# for i in range(1,r+1):
#     arr[i].append(1)
#     dp[i].append(0)
#     inputline = list(map(int,readline().split()))
#     for j in range(1,c+1):
#         arr[i].append(inputline[j-1])
#         if arr[i][j] == 1:
#             dp[i].append(0)
#         elif dp[i-1][j] < 1 and dp[i][j-1] < 1:
#             dp[i].append(1)
#         elif dp[i-1][j] > 0 and dp[i][j-1] < 1:
#             dp[i].append(dp[i-1][j]+1)
#         elif dp[i-1][j] < 1 and dp[i][j-1] > 0:
#             dp[i].append(dp[i][j-1]+1)
#         elif dp[i-1][j] > 0 and dp[i][j-1] > 0:
#             dp[i].append(dp[i-1][j] * dp[i][j-1])