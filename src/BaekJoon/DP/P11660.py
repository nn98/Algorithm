import sys
readline = sys.stdin.readline

def main():
    n, m = map(int,readline().split())
    matrix = [[0] * n for _ in range(n)]
    dp = [[0] * n for _ in range(n)]
    for i in range(n):
        inputnums = list(map(int,readline().split()))
        for j in range(n):
            matrix[i][j] = inputnums[j]
            # dp[i][j] = matrix[i][j] + (dp[i][j-1] if j > 0 else 0) + (dp[i-1][j] if i > 0 else 0)
            dp[i][j] = inputnums[j] + (dp[i][j-1] if j>0 else 0)

    # print('\n'.join(' '.join(map(str,line) )for line in dp))
    for _ in range(m):
        x1, y1, x2, y2 = map(lambda x: int(x) -1, readline().split())
        # print(dp[x2][y2] - (dp[x1-1][y2] if x1 > 0 else 0) - (dp[x2][y1-1] if y1 > 0 else 0) + dp[x1][y1])
        ans = 0
        for i in range(x1, x2+1):
            ans += dp[i][y2] - (dp[i][y1-1] if y1>0 else 0)
        print(ans)

if __name__ == "__main__":
    main()
