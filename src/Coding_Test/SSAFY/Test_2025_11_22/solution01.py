T = int(input())
for test_case in range(1, T + 1):
    N = int(input())
    numbers = list(map(int,input().split()))
    result = 0
    for i in range(N):
        result += numbers[i]
        for j in range(i+1, N):
            value = numbers[i]
            for k in range(i+1, j+1):
                value ^= numbers[k]
            result += value
    print("#%d %d" % (test_case, result))
