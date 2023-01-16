import sys
n=int(sys.stdin.readline())
scores=list(map(int,sys.stdin.readline().split()))
scores.sort()
result=0
i=0
while i<len(scores):
    val=scores[i]
    # print(i,val)
    result+=val
    j=i+1
    while j<len(scores):
    # for j in range(i+1,len(scores)):
        if scores[j]-scores[j-1]!=1:
            break;
        j+=1
    i=j
print(n,scores,result)