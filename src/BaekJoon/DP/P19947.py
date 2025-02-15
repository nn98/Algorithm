import sys
readline = sys.stdin.readline

def main():
    h, y = map(int,readline().split())
    dp = [0] * (y+1)
    dp[0] = h
    for i in range(1, y+1):
        dp[i] = int(dp[i-1] * 1.05)
        if i >= 3:
            dp[i] = int(max(dp[i],dp[i-3] * 1.2))
        if i>= 5:
            dp[i] = int(max(dp[i],dp[i-5] * 1.35))
    print(dp[y])

if __name__ == "__main__":
    main()
