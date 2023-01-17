import sys
n=int(sys.stdin.readline())
a={}
for i in range(n):
    line=list(sys.stdin.readline().split())
    count=int(line[0])
    if line[1] not in a.keys():
        a[line[1]]={}
    # depth=''
    # insert=[]
    depth=0
    temp=a[line[1]]
    for j in range(2,count+1):
        depth+=1
        # print(line[j] , temp, temp.keys())
        if line[j] not in temp.keys():
            temp[line[j]]= {}
        # print(a)
        temp=temp[line[j]]
        # print(temp)
# a=dict(sorted(a.items()))
# print(a)
# print(len(a))
# print(len(a['B']['A']))
def printResult(cave,depth):
    # print('pR:',dict,depth)
    cave=dict(sorted(cave.items()))
    for key in cave.keys():
        print(depth*'--'+key)
        if len(cave[key]) != 0:
            printResult(cave[key],depth+1)
printResult(a,0)
# for v1 in a.keys():
#     v1=dict(sorted(v1.items()))
#     print(v1)