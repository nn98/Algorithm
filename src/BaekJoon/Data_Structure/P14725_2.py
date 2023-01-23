# 편하지만 미숙함
# 스스로의 공간지각능력에 실망했다
import sys
n=int(sys.stdin.readline())
a={}
for i in range(n):
    line=list(sys.stdin.readline().split())
    count=int(line[0])
    if line[1] not in a.keys():
        a[line[1]]={}
    depth=0
    temp=a[line[1]]
    for j in range(2,count+1):
        depth+=1
        if line[j] not in temp.keys():
            temp[line[j]]= {}
        temp=temp[line[j]]
def printResult(cave,depth):
    cave=dict(sorted(cave.items()))
    for key in cave.keys():
        print(depth*'--'+key)
        if len(cave[key]) != 0:
            printResult(cave[key],depth+1)
printResult(a,0)