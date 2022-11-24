class Fan:
    def __init__(self,price,additionalTime,additionalCost) -> None:
        self.price=price
        self.additionalTime=additionalTime
        self.additionalCost=additionalCost
    def calc(self,time):
        price=self.price
        time=int((time-1)/self.additionalTime)
        price+=(time*(time+1)/2)*self.additionalCost
        return int(price)
n,m=map(int,input().split())
list=[]
j=0
for i in range(n):
    a,b,c=map(int,input().split())
    list.append(Fan(a,b,c))
    if list[i].calc(m)<list[j].calc(m):
        j=i
print(j+1,list[j].calc(m))