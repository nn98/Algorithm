import sys
readline = sys.stdin.readline

N = int(readline())
crane = list(map(int, readline().split()))
crane.sort(reverse=True)
M = int(readline())
box = list(map(int, readline().split()))
box.sort(reverse=True)

ans = 1
while ans:
    transport = True
    for i in crane:
        for j in range(M):
            if box[j] <= i:
                transport = False
                box.pop(j)
                M-=1
                break
        if M < 1:
            break
    if transport:
        print(-1)
        break
    if M < 1:
        print(ans)
        break
    ans += 1
