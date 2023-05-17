n = int(input())
tower = list(map(int,input().split()))
res = 1
for i in range(1, n):
    if tower[i-1] <= tower[i]:
        res += 1
print(res)