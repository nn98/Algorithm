for i in range(int(input())):
    r='Case #'+str(i+1)+': '
    a=list(map(int,input().split()))
    a.sort()
    if a[2]>=a[0]+a[1]:
        r+='invalid!'
    elif a[0]==a[1] and a[1]==a[2]:
        r+='equilateral'
    elif a[0]==a[1] or a[1]==a[2]:
        r+='isosceles'
    else:
        r+='scalene'
    print(r)
