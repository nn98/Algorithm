# 소마 코테 후유증이 크다
# 다양한 예외 케이스를 생각해보고, 시도해봐야 한다.
n=int(input())
l,c,r=0,4,4
case=[8,4,2,1]
if n > 229:
    l,c=1,4
elif n > 219:
    l,c=230-n if 230-n < 2 else 2,3
elif n > 209:
    l,c=220-n if 220-n < 4 else 4,2
else:
    l,c=210-n if 210-n < 8 else 8,1
# print(l,c,r)
if c != 4:
    if case[c] >= l:
        c+=1;
print(c)