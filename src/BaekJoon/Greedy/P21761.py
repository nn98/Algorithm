import sys

input = sys.stdin.readline

def calcSize(arr):
    ans = 1
    for item in arr:
        ans *= item
    return ans

dic = {0:'A', 1:'B', 2:'C', 3:'D'}
n, k = map(int,input().split())
nowLen = list(map(int, input().split()))
change = [[] for _ in range(4)]

for _ in range(n):
    item, size = input().split()
    if item == 'A':
        change[0].append(int(size))
    elif item == 'B':
        change[1].append(int(size))
    elif item == 'C':
        change[2].append(int(size))
    else:
        change[3].append(int(size))

for i in range(4):
    change[i].sort()
maxSize = calcSize(nowLen)

for _ in range(k):
    maxIdx = -1
    for i in range(4):
        if len(change[i]):
            nowLen[i] += change[i][-1]
            tmpSize = calcSize(nowLen)
            nowLen[i] -= change[i][-1]
            if maxSize < tmpSize:
                maxSize = tmpSize
                maxIdx = i
    changeLen = change[maxIdx].pop(-1)
    nowLen[maxIdx] += changeLen
    print(dic[maxIdx], changeLen)
