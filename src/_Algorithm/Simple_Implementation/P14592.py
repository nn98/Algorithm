result=[]
win=1
for _ in range(int(input())):
    data=list(map(int,input().split()))
    if _ == 0:
        result=data
    change=False
    if result[0]>data[0]:
        continue
    if result[0] == data[0]:
        if result[1] < data[1]:
            continue
        if result[1] == data[1]:
            if result[2] < data[2]:
                continue
    result=data
    win=_+1
print(win)