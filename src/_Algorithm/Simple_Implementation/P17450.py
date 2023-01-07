a=[]
b,c=map(int,input().split())
a.append(c/b)
b,c=map(int,input().split())
a.append(c/b)
b,c=map(int,input().split())
a.append(c/b)
c=b=0
for i in range(3):
    if b<a[i]:
        b,c=a[i],i
print(b,c)
if c < 1:
    print('S')
elif c < 2:
    print('N')
else:
    print('U')