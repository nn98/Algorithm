import sys
readline = sys.stdin.readline

def main():
    n = int(readline())
    dp = [0] * 11
    dp[2] = 1
    dp[3] = 3
    for i in range(4,11):
        dp[i] = (dp[i//2] * 2 + i * i // 4) if i % 2 < 1 else (dp[i//2] + dp[i//2+1] + i//2 * (i//2+1))
    print(dp[n])

if __name__ == "__main__":
    main()
