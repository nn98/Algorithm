case = int(input())

def dist(start, end):
    value = 0
    if start > end:
        value = M - start + end
    elif start < end:
        value = end - start
    return value

for i in range(1, case+1):
    N, M = map(int,input().split())
    A = list(map(int,input().split()))
    dp = []
    for j in range(N):
        value = 0
        if j == 0:
            value = dist(A[j], A[j+1])
        elif j == N - 1:
            value = dist(A[j-1], A[j])
        else :
            value = dist(A[j-1], A[j]) + dist(A[j], A[j+1]) - dist(A[j-1], A[j+1])
        dp.append(value)

    target = dp.index(max(dp))
    A.pop(target)
    answer = 0
    for j in range(1,N-1):
        answer += dist(A[j-1], A[j])
    print('#'+str(i), answer)

# 3
# 4 10
# 1 5 2 8
# 3 5
# 1 2 4
# 3 5
# 1 4 2