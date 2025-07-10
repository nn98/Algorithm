import sys
readline = sys.stdin.readline

def main():
    n = int(readline())
    dp = [0] * 91
    dp[1] = 1
    dp[2] = 1
    # dp[3] = dp[1] + dp[2]
    for i in rnage(3, 91):
        dp[i] = dp[i-1] + dp[i-2]
    print(dp[n])

if __name__ == "__main__":
    main()
