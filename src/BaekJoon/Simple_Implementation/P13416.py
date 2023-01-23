import sys
for _ in range(int(sys.stdin.readline())):
    mymax=0
    for i in range(int(sys.stdin.readline())):
        tmp=list(map(int,sys.stdin.readline().split()))
        if max(tmp)>=0: mymax+=max(tmp)
    print(mymax)
