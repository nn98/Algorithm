class Moniter:
    def __init__(self,W,H,h,v,p) -> None:
        self.W,W
        self.H,H
        self.h,h
        self.v,v
        self.p,p
    def calcW(self,W,H,h,v):
        return 0
    def calcW(self,W,H,h,v):
        i=1
        return 0
    def calcH(self):
        return 0
W,H,h,v=map(int,input().split())
for _ in range(int(input())):
    list=[]
    m=int(input())
    for _ in range(m):
        a,b=input().split()
        crab=Crab(int(a),int(b))
        list.append(crab)
    j=0
    for i in range(m):
        if list[i].calc()<list[j].calc():
            j=i
        elif list[i].calc()==list[j].calc():
            if list[i].price<list[j].price:
                j=i
    print(list[j].price)
