m={}
# m[50]=1
# print(m.keys())
# if 50 in m.keys():
#     print('yes')
n,s=map(int,input().split())
v=list(map(int,input().split()))
r=0
def p(x, u):
    if x==n//2:
        if u not in m.keys():
            m[u]=0
        m[u]+=1
        return
    p(x+1,u)
    p(x+1,u+v[x])
def q(x, u):
    if x==n:
        global r
        if s-u in m.keys():
            r+=m[s-u]
        return
    q(x+1,u)
    q(x+1,u+v[x])
p(0,0)
q(n//2,0)
if s==0:
    r-=1
print(r)