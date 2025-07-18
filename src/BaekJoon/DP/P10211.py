import sys
readline = sys.stdin.readline

def main():
    n = int(readline())
    for _ in range(n):
        m = int(readline())
        arr = list(map(int,readline().split()))
        dp = [0] * m
        dp[0] = arr[0]
        for i in range(1,m):
            dp[i] = max(arr[i],dp[i-1])
        print(max(dp))

if __name__ == "__main__":
    main()
