n=int(input())
r=''
for i in range(n*2):
    r+='@'*n+' '*(n*3)+'@'*n+"\n"
for i in range(n):
    r+='@'*n*5+"\n"
for i in range(n):
    r+='@'*n+' '*(n*3)+'@'*n+"\n"
for i in range(n):
    r+='@'*n*5+"\n"
print(r)