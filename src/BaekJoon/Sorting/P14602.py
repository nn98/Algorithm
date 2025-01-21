import sys
readline = sys.stdin.readline

def main():
    n, m, k, w = map(int,readline().split())
    matrix = [list(map(int,readline().split())) for _ in range(n)]
    result = [[0] * (m-w+1) for _ in range(n-w+1)]
    for j in range(m-w):
        arr = []
        for i in range(n-w):
            if not arr:
                for k in range(w):
                    arr.extend(matrix[i][j:j+w])
            else:
                arr.extend(matrix[i][j:j+w])
            temp = arr.copy()
            temp.sort()
            result[j][i] = temp[w//2]
            arr = arr[w:]
    print('\n'.join(' '.join(map(str, val)) for val in result))


if __name__ == "__main__":
    main()
