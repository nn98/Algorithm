import sys
n=int(sys.stdin.readline())
a={}
for i in range(n):
    line=list(sys.stdin.readline().split())
    count=int(line[0])
    if line[1] not in a.keys():
        a[line[1]]=[]
    depth=''
    for j in range(2,count+1):
        depth+='--'
        a[line[1]].append(depth+line[j])
        print(a)
for key in a.keys():
    a[key].sort()
# print(a)
for key in a.keys():
    print(key)
    for data in a[key]:
        print(data)