import sys
readline = sys.stdin.readline

def main():
    n, m = map(int,readline().split())
    arr = [i+1 for i in range(n)]
    for _ in range(m):
        a, b = map(lambda x: int(x)-1, readline().split())
        arr[a], arr[b] = arr[b], arr[a]
    print(' '.join(map(str,arr)))

if __name__ == "__main__":
    main()

