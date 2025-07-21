import sys
readline = sys.stdin.readline

def main():
    n = int(readline())
    arr = [list(map(int,readline().split())) for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if arr[i][j] == 9:
                shark = (i,j)


if __name__ == "__main__":
    main()
