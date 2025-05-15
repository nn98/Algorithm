import sys
readline = sys.stdin.readline
def preprocessing(p):
    pi = []
    j = 0
    k = -1
    pi.append(k)
    while j < len(p):
        if k == -1 or p[j] == p[k]:
            j+=1
            k+=1
            pi.append(k)
        else:
            k = pi[k]
    return pi
def findindex(a, p):
    n = len(a)
    m = len(p)
    pi = preprocessing(p)
    i=0
    j=0
    while i<n:
        if j==-1 or a[i]==p[j]:
            i+=1
            j+=1
        else:
            j = pi[j]
        if j==m:
            return i-m
    return -1
a = "abcdefabdafaabcdabcwzaaa"
p = "abcdabcwz"
print('preprocessing',preprocessing(p))
print(findindex(a,p))
