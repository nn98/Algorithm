import sys

def main():
    readLine = sys.stdin.readline
    N = int(readLine())
    matrix = [list(map(int, readLine().split())) for _ in range(N)]

    dp = [[float('inf')] * N for _ in range(N)]
    dp[0][0] = 0

    for i in range(N):
        for j in range(N):
            if i == 0 and j == 0: continue

            min_cost = float('inf')
            # 위쪽 체크
            if i > 0:
                cost = dp[i-1][j]
                if matrix[i][j] >= matrix[i-1][j]:
                    cost += (matrix[i][j] - matrix[i-1][j] + 1)
                min_cost = min(min_cost, cost)

            # 왼쪽 체크
            if j > 0:
                cost = dp[i][j-1]
                if matrix[i][j] >= matrix[i][j-1]:
                    cost += (matrix[i][j] - matrix[i][j-1] + 1)
                min_cost = min(min_cost, cost)

            dp[i][j] = min_cost

    print(dp[N-1][N-1])

if __name__ == "__main__":
    main()
