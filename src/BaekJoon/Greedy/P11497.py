import sys

readline = sys.stdin.readline
T = int(readline())
for _ in range(T):
    n = int(readline())
    arr = list(map(int, readline().split()))
    arr.sort()
    ans = [0] * n
    # print('arr',arr)
    start , end = 0, n-1
    for i in range(n):
        ans[start if i % 2 == 0 else end] = arr[i]
        start -= -(i%2)
        end -= i%2
        # print('ans',ans,start,end)


    answer = abs(ans[-1] - ans[0])
    for i in range(n):
        answer = max(answer, abs(ans[i] - ans[i-1]))

    print(answer)
