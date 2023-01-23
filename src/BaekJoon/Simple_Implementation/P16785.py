a=list(map(int,input().split()))
i,r=0,0
while True:
    i+=1
    r+=a[0]
    if i%7==0:
        r+=a[1]
    if r>=a[2]:
        break;
print(i)
