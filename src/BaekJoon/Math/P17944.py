n,t=map(int,input().split())
r = 0
if t > n*2:
    t -= n*2
    if int(t/(n*2-1)) < 1:
        r = n*2-t%(n*2)
    else:
        r = t%(n*2)
else:
    r=t
print(r)