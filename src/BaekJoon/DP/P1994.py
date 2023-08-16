import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**4)
 
def f(prv, d, ret):
    lo = 0; hi = len(a)-1
    while lo<hi:
        mid = (lo+hi)//2
        if a[mid]<prv+d:
            lo = mid+1
        elif a[mid]>prv+d:
            hi = mid-1
        else:
            lo = mid
            break
    if a[lo] == prv+d:
        return f(a[lo], d, ret+1)
    return ret
 
n=int(input())
arr=[]
a=[]
for i in range(n):
    arr.append(int(input()))
arr.sort()
 
ans = 1
now = 1
a=[arr[0]]
for i in range(1, n):
    if arr[i]==arr[i-1]:
        now += 1
    else:
        ans = max(ans,now)
        now = 1
        a.append(arr[i])
ans = max(ans,now)
for i in range(len(a)):
    for j in range(i+1,len(a)):
        ans = max(ans, f(a[i], a[j]-a[i], 1))
print(ans)
