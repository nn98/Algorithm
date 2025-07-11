import sys
readline = sys.stdin.readline

def main():
    n, m = map(int,readline().split())
    matrix = [[] for _ in range(n)]
    dp = [[0] * n for _ in range(n)]
    for i in range(n):
        inputnums = list(map(int,readline().split()))
        for j in range(n):
            matrix[i][j] = inputnums[j]
            dp[i][j] = matrix[i][j] + (dp[i][j-1] if j > 0 else 0) + (dp[i-1][j] if i > 0 else 0)

    x1, y1, x2, y2 = map(int,readline().split())
    print(dp[x2][y2] - (dp[x1-1][y2] if x1 > 0 else 0) - (dp[x2][y1-1] if y1 > 0 else 0) + dp[x1][y1])

if __name__ == "__main__":
    main()
