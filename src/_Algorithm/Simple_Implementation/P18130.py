class Fan:
    def __init__(self,price,additionalTime,additionalCost) -> None:
        self.price=price
        self.additionalTime=additionalTime
        self.additionalCost=additionalCost
    def calc(self,time):
        return self.price+int(time/self.additionalTime)*self.additionalCost

n,m=map(int,input().split())
list=[]
for _ in range(n):
    a,b,c=map(int,input().split())
    list.append(Fan(a,b,c))
j=0
for i in range(n):
    if list[i].calc(m)<list[j].calc(m):
        j=i
print(j,list[j].calc(m))