n=int(input())
a=input().split('b')
m=len(a)-1
n-=m
if n < m:
    print('bigdata?')
elif n > m:
    print('security!')
else:
    print('bigdata? security!')