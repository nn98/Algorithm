# 13/18
import sys
import heapq
import math

readLine = sys.stdin.readline
N, M, A, B, C = map(int, readLine().split())
R = float('inf')
N+=1
matrix = [[] for _ in range(N)]
total = [float('inf')]*N
biggest = [float('inf')]*N
def dijkstra(start):
    q=[]
    heapq.heappush(q,(0,start,'0'))
    total[start] = 0
    biggest[start] = 0
    while(q):
        cost, node, costs = heapq.heappop(q)
        print(cost,node,' / ',costs)
        print(total)
        print(biggest)
        if node == B:
            hist = sorted(list(map(int,costs.split())), reverse=True)
            # print('hist:',hist)
            biggest[node] = min(hist[0],biggest[node])
        for nextCost, nextNode in matrix[node]:
            newCost = total[node] + nextCost
            print('node',node,'nextNode',nextNode, 'newCost', newCost)
            if newCost > C: continue
            if total[nextNode] > newCost:
                costs = ' ' + costs + ' ' + str(nextCost)
                total[nextNode] = newCost
                heapq.heappush(q,(nextCost,nextNode, costs))

for _ in range(M):
    a, b, c = map(int, readLine().split())
    matrix[a].append((c,b))
    matrix[b].append((c,a))
# for a in matrix: print(a)

dijkstra(A)

print(biggest[B] if biggest[B] != float('inf') else -1)