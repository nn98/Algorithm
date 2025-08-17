import sys

A, B = map(int, sys.stdin.readline().split())
answer = 0

# F(X)
def calculate(x):
    # 2의 몇 제곱 2^two_times
    two_times = 1
    # 먼저 1 * X 만큼 미리 더해 놓음
    ans = x
    # 2의 제곱씩 늘려가면서 합을 구해줌
    while 2 ** two_times <= x:
        ans += (x // (2 ** two_times)) * (2 ** (two_times - 1))
        two_times += 1
    return ans

# f(A) + f(A+1) ... + f(B-1) + f(B)
print(calculate(B) - calculate(A - 1))
