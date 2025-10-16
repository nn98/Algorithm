import sys
import heapq

# 최소 신장 그래프
input = sys.stdin.readline
n = int(input())
eList = []   # [시작점, 도착점, 비용]
vRoot = [i for i in range(n + 1)]
for i in range(1, n + 1):
    eList.append([0, i, int(input())])
for i in range(n):
    tmp = list(map(int, input().split()))
    for j in range(n):
        if i != j:
            eList.append([i + 1, j + 1, tmp[j]])

eList.sort(key=lambda x:x[2])

def find_parent(x):
    if x != vRoot[x]:
        vRoot[x] = find_parent(vRoot[x])
    return vRoot[x]

result = 0
for u, v, w in eList:
    u_p = find_parent(u)
    v_p = find_parent(v)
    if u_p != v_p:
        if u_p > v_p:
            vRoot[u_p] = v_p
        else:
            vRoot[v_p] = u_p
        result += w

print(result)
