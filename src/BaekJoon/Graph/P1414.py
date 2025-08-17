import sys,heapq
input=sys.stdin.readline

N=int(input())

String=[ list(input().rstrip()) for _ in range(N) ]
Tree=[ [] for _ in range(N+1) ] ; total=0


for i in range(N):
    for j in range(N):
        if ord('a') <= ord(String[i][j]) <= ord('z'):

            weight = ord(String[i][j]) - ord('a') + 1
            Tree[i].append((weight,j)) #가중치 먼저
            Tree[j].append((weight,i))

        elif ord('A') <= ord(String[i][j]) <= ord('Z'):

            weight = ord(String[i][j]) - ord('A') + 27
            Tree[i].append((weight,j)) #가중치 먼저
            Tree[j].append((weight,i))
        else:
            weight = 0
        if weight != 0:
            total += weight

heap=[(0,0)] ; visit=[False]*(53)

while heap:

    value,node=heapq.heappop(heap)

    if not visit[node]:
        visit[node]=True
        total-=value

        for i,j in Tree[node]:
            heapq.heappush(heap,(i,j))



for i in range(N):
    if not visit[i]:
        print(-1)
        exit(0)
print(total)
