case = int(input())
for i in range(case):
    N, P, B = map(int,input().split())
    A = list(map(int,input().split()))
    A.sort()

    answer = 0
    for j in range(A[0],A[-1]+2):
        price = 0
        for count in A:
            price += B * j if j <= count else P
        answer = max(answer, price)

    print('#'+str(i+1),answer)
