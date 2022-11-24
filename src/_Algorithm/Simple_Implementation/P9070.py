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
    v=list[0].calc()
    j=0
    for i in range(m):
        if list[i].calc()<v:
            j=i
            v=list[i].calc()
    print(list[j].price)
