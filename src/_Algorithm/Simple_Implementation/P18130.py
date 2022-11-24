class Fan:
    def __init__(self,price,additionalTime,additionalCost) -> None:
        self.price=price
        self.additionalTime=additionalTime
        self.additionalCost=additionalCost
    def calc(self,time):
        price=self.price
        count=1
        for i in range(0,time+1,self.additionalTime):
            price+=self.additionalCost*count
            count+=1
        return price

n,m=map(int,input().split())
list=[]
for _ in range(n):
    a,b,c=map(int,input().split())
    list.append(Fan(a,b,c))
j=0
for i in range(n):
    print(list[i].calc(m))
    if list[i].calc(m)<list[j].calc(m):
        j=i
print(j+1,list[j].calc(m))