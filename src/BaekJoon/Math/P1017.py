import sys
readline = sys.stdin.readline

def main():
    n = int(readline())
    arr = list(map(int,readline().split()))
    prime = [True] * 50000
    prime[1] = False
    for idx in range(50000):
        if prime[idx]:
            for idx_next in range(idx, 50000, idx):
                prime[idx_next] = False
    print(prime)

if __name__ == "__main__":
    main()
