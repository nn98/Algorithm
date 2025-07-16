import sys
readline = sys.stdin.readline

def main():
    n = int(readline())
    arr = [float(readline()) for _ in range(n)]
    max_prod = arr[0]
    curr = arr[0]
    for i in range(1, n):
        curr = max(arr[i], curr * arr[i])
        max_prod = max(max_prod, curr)
    print(f"{max_prod:.3f}")

if __name__ == "__main__":
    main()
