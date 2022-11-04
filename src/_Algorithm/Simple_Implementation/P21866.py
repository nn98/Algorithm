c,d,v,u,r=0,2,100,0,''
for i in list(map(int,input().split())):
    c+=1;
    if c>d:
        d+=2
        v+=100
    if i>v:
        r='hacker'
    u+=i
print(r if r!='' else 'draw' if u>99 else 'none')