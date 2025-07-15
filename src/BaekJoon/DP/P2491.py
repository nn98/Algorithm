import sys
readline = sys.stdin.readline

def main():
    n = int(readline())
    arr = list(map(int,readline().split()))
    dp_asc = [1] * n
    dp_dsc = [1] * n
    for i in range(1, n):
        if arr[i-1] <= arr[i]:
            dp_asc[i] = dp_asc[i-1] + 1
        if arr[i-1] >= arr[i]:
            dp_dsc[i] = dp_dsc[i-1] + 1
    print(dp_asc)
    print(dp_dsc)

if __name__ == "__main__":
    main()
