import sys

def main():
    N, T = map(int, sys.stdin.readline().split())
    times = list(map(int, sys.stdin.readline().split()))

    total = 0
    ans = []
    for t in times:
        cycles = (t + T - 1) // T  # 올림 계산
        total += cycles * T
        ans.append(str(total))

    print(' '.join(ans))

if __name__ == "__main__":
    main()
