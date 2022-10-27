for i in range(int(input())):
    a,b=input().split()
    if b=='kg':
        a=float(a)*2.2046
        b='lb'
    elif b=='lb':
        a=float(a)*0.4536
        b='kg'
    elif b=='l':
        a=float(a)*0.2642
        b='g'
    else:
        a=float(a)*3.7854
        b='l'
    print(f'{a:.4f}',b)