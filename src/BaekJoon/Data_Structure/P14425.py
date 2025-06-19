import sys
readline = sys.stdin.readline

def main():
    n, m = map(int,readline().split())
    arr = set([readline() for _ in range(n)])
    print(arr)

if __name__ == "__main__":
    main()
