L = int(input())
D = int(input())
X = int(input())
N = 10001
M = 0
for i in range(L, D+1):
    res = 0
    for j in str(i):
        res += int(j)
    if res == X:
        N = min(N, i)
        M = max(M, i)
print(N)
print(M)
