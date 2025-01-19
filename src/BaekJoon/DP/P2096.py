import sys
readline = sys.stdin.readline

def main():
    n = int(readline())
    matrix = [list(map(int,readline().split())) for _ in range(n)]
    dp_min = [[0]*3 for _ in range(n)]
    dp_max = [[0]*3 for _ in range(n)]
    for i in range(3):
        dp_max[0][i] = dp_min[0][i] = matrix[0][i]
    for i in range(1, n):
        for j in range(3):
            if j == 0:
                dp_min[i][j] = min(dp_min[i-1][0], dp_min[i-1][1]) + matrix[i][j]
                dp_max[i][j] = max(dp_max[i-1][0], dp_max[i-1][1]) + matrix[i][j]
            if j == 1:
                dp_min[i][j] = min(dp_min[i-1][0], dp_min[i-1][1], dp_min[i-1][2]) + matrix[i][j]
                dp_max[i][j] = max(dp_max[i-1][0], dp_max[i-1][1], dp_max[i-1][2]) + matrix[i][j]
            if j == 2:
                dp_min[i][j] = min(dp_min[i-1][1], dp_min[i-1][2]) + matrix[i][j]
                dp_max[i][j] = max(dp_max[i-1][1], dp_max[i-1][2]) + matrix[i][j]
    print(max(dp_max[n-1]), min(dp_min[n-1]))
if __name__ == "__main__":
    main()
