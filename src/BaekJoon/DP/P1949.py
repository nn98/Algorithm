import sys
readline = sys.stdin.readline

def main():
    n = int(readline())
    population = list(map(int, readline().split()))
    conn = [[] for _ in range(n)]
    for i in range(n-1):
        a, b = map(lambda x: int(x)-1, readline().split())
        conn[a].append(b)
        conn[b].append(a)
    dp = [[int(-1e9)] for _ in range(2)]
    print(dp)

if __name__ == '__main__':
    main()
