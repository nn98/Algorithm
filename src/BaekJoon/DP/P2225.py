import sys
readline = sys.stdin.readline

def main():
    n, k = map(int,readline().split())
    dp = [[0] * (n + 1) for _ in range(k+1)]
    for i in range(k+1):
        dp[i][0] = 1
    # print(*[item for row in dp for item in row])
    for i in range(1, k+1):
        for j in range(1, n+1):
            dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % 1000000000
    # print('\n'.join(' '.join(map(str,d)) for d in dp))
    print(dp[k][n])

if __name__ == "__main__":
    main()
