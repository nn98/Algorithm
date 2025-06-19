import sys
readline = sys.stdin.readline

def main():
    n, m = map(int,readline().split())
    arr = set([readline() for _ in range(n)])
    ans = sum([1 if readline() in arr else 0 for _ in range(m)])
    print(ans)

if __name__ == "__main__":
    main()
