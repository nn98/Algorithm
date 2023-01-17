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
    # depth=0
    temp=a[line[1]]
    for j in range(2,count+1):

        # depth+='--'
        # depth+=1
        # a[line[1]].append([depth,line[j]])
        # insert.append([depth,line[j]])
    a[line[1]].append(insert)
    # print(a)
a=dict(sorted(a.items()))
# for key in a.keys():
#     a[key].sort(key = lambda x : (x[0],x[1]))
# print(a)
# for key in a.keys():
#     print(key)
#     for data in a[key]:
#         print(data[0]*'--'+data[1])
for key in a.keys():
    print(key)
    for data in a[key]:
        for detail in data:
            print(detail[0]*'--'+detail[1])