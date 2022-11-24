class Crab:
    def __init__(self,gram,price) -> None:
        self.gram=gram
        self.price=price
    def calc(self):
        return self.price/self.gram

n=int(input())
for _ in range(n):
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
