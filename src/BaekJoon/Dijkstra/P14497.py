from sys import stdin
from heapq import heappop,heappush
input=stdin.readline

dx=[0,0,1,-1]
dy=[-1,1,0,0]

inf=float('inf')

n,m=map(int,input().split())
sy,sx,ey,ex=map(lambda x:int(x)-1,input().split())
arr=[input().rstrip() for i in range(n)]
vi=[[inf]*m for i in range(n)]
vi[sy][sx]=0

q=[(0,sx,sy)]

while q:
    nowv,x,y=heappop(q)
    if vi[y][x]<nowv:
        continue
    for i in range(4):
        nx=x+dx[i]
        ny=y+dy[i]
        if -1<nx<m and -1<ny<n:
            nextv=nowv+(arr[ny][nx]!='0')
            if nextv<vi[ny][nx]:
                heappush(q,(nextv,nx,ny))
                vi[ny][nx]=nextv

print(vi[ey][ex])
