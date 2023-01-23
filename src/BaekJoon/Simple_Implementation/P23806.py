n=int(input())
for i in range(3):
    if i == 0:
        for j in range(n):
            print("@"*(5*n))
    elif i == 1:
        for j in range(n*3):
            print("@"*n+" "*(3*n)+"@"*n)
    else :
        for j in range(n):
            print("@"*(5*n))