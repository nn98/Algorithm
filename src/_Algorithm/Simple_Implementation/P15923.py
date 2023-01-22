i=int(input())
x,y=map(int,input().split())
p,q=x,y
r=0
for j in range(1,i):
    X,Y=map(int,input().split())
    r+=abs(x-X)
    r+=abs(y-Y)
    x,y=X,Y
r+=abs(x-p)
r+=abs(y-q)
print(r)