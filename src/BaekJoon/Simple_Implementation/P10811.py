import sys
readline = sys.stdin.readline

def main():
    n, m = map(int,readline().split())
    arr = [i+1 for i in range(n)]
    for _ in range(m):
        a, b = map(lambda x: int(x)-1, readline().split())
        for i in range(0, (b-a)/2):
            arr[a+i], arr[b-i] = arr[b-i], arr[a+i]
    print(' '.join(map(str,arr)))

if __name__ == "__main__":
    main()
