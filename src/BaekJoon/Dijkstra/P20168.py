import sys
import heapq
import math

readLine = sys.stdin.readline
N, M, A, B, C = map(int, readLine().split())
N+=1
matrix = [[] for _ in range(N)]
total = [float('inf')]*N
biggest = [float('-inf')]*N

def dijkstra(start):
    q=[]
    heapq.heappush(q,(0,start))
    total[start] = 0
    biggest[start] = 0
    while(q):
        cost, node = heapq.heappop(q)
        # print(cost,node)
        # print(total)
        # print(biggest)
        if node == B: continue
        if total[node] > C: continue
        if biggest[node] < cost: continue
        for nextCost, nextNode in matrix[node]:
            newCost = total[node] + nextCost
            if newCost <= C and total[nextNode] > newCost:
                if biggest[nextNode] != float('-inf') and biggest[nextNode] < max(nextCost, biggest[node]): continue
                total[nextNode] = newCost
                biggest[nextNode] = max(biggest[nextNode], nextCost, biggest[node])
                heapq.heappush(q,(nextCost,nextNode))

for _ in range(M):
    a, b, c = map(int, readLine().split())
    matrix[a].append((c,b))
    matrix[b].append((c,a))
# for a in matrix: print(a)

dijkstra(A)

print(biggest[B] if biggest[B] != float('-inf') else -1)
