import sys
readline = sys.stdin.readline

def main():
    T = int(readline())
    for i in range(T):
        n, m = map(int,readline().split())
        matrix = [readline().split() for _ in range(n)]
        print(matrix)

if __name__ == "__main__":
    main()
