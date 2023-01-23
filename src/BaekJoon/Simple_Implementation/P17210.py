n=int(input())
m=int(input())
if n>5:
    print("Love is open door")
else:
    for i in range(1,n):
        m+=1
        m%=2
        print(m)