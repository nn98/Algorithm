import sys,math,collections
input = sys.stdin.readline

N = int(input())
candy = [int(input()) for i in range(N)]
S = sum(candy)
candy = collections.Counter(candy); N = len(candy)

DP = [[0]*(S+1) for i in range(N+1)]; DP[0][0] =  1

n = 0
for c in candy:
    for s in range(S+1):
        DP[n+1][s] = DP[n][s]
        for i in range(1,candy[c]+1):
            if s-i*c<0:
                break
            DP[n+1][s] += DP[n][s-i*c]
    n += 1

prime = []; check = [0]*(S+1); sq = int(math.sqrt(S))
for p in range(2,S+1):
    if check[p]:
        continue
    prime.append(p)
    if p>sq:
        continue
    i = 2
    while i*p<=S:
        check[i*p] = 1
        i += 1

result = 0
for p in prime:
    result += DP[N][p]
print(result)
