import sys
readline = sys.stdin.readline

def main():
    n, k = map(int,readline().split())
    dp = [[0] * (n + 1) for _ in range(k+1)]
    for i in range(n):
        dp[1][i] = 1
    print(dp)

if __name__ == "__main__":
    main()
