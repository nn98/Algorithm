import sys
sys.setrecursionlimit(100)  # 재귀 깊이 제한 확장

def main():
    n = int(sys.stdin.readline())
    memo = {1: 0, 2: 1, 3: 3}  # 초기값 저장

    def dp(x):
        if x in memo:
            return memo[x]
        if x % 2 == 0:
            half = x // 2
            res = 2 * dp(half) + half * half
        else:
            half = x // 2
            res = dp(half) + dp(half + 1) + half * (half + 1)
        memo[x] = res
        return res

    print(dp(n))

if __name__ == "__main__":
    main()
