n=int(input())
l=list(map(int,input().split()))
a,b,c,r=l.count(-1),l.count(1),l.count(0),'INVALID'
if n/2 > c:
    if a > b:
        r='REJECTED'
    elif b > a :
        r="APPROVED"
print(r)