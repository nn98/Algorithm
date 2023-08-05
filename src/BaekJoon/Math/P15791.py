mod = 1000000007
def mypow(a, b):
    result = 1
    while(b>0):
        if(b&1) :
            result*=a
            result%=mod
        b = b>>1
        a*=a
        a%=mod
    return result

def solution():
    import sys
    input = sys.stdin.readline
    n, m = map(int, input().split())
    a, b = 1, 1
    for i in range(2, n+1):
        a*=i
        a%=mod
    for i in range(2, m+1):
        b*=i
        b%=mod
    for i in range(2, n-m+1):
        b*=i
        b%=mod
    print(a*mypow(b, mod-2)%mod)
solution()
