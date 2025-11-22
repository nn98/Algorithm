T = int(input())
for test_case in range(1, T + 1):
    N = int(input())
    numbers = list(map(int, input().split()))
    result = 0

    for i in range(N):
        value = 0
        for j in range(i, N):
            value ^= numbers[j]   # i..j 구간 XOR
            result += value

    print("#%d %d" % (test_case, result))
