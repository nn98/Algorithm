for _ in range(int(input())):
    a,b=map(int,input().split())
    i,j=0,1
    for x in range(a//b):
        i+=j
        j+=2
    print(i)