import sys
readline = sys.stdin.readline

def main():
    n = int(readline())
    arr = []
    for i in range(n):
        arr.append(float(readline()))

    dp = [[0]*n for _ in range(2)]
    dp[0][0] = dp[1][0] = arr[0]
    for i in range(1, n):
        dp[0][i] = max(max(dp[0][i-1],dp[1][i-1]) * arr[i], arr[i])
        dp[1][i] = dp[1][i-1] * arr[i]
    print(round(max(max(dp[0]),max(dp[1])),3))

if __name__ == "__main__":
    main()
