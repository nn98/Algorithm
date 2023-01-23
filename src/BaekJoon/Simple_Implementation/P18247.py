# t=int(input())
# n,m=map(int,input().split())
# print(t,n,m)
for i in range(int(input())):
    n,m=map(int,input().split())
    if n<12 or m<4:
        print(-1)
    else:
        print(11*m+4)