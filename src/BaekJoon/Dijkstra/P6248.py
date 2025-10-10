import sys
import heapq as hq
input = sys.stdin.readline

def dijkstra(start):
    q = []
    min_dis = [float('inf') for _ in range(n+1)]
    min_dis[start] = 0
    hq.heappush(q,[0,start])

    while q:
        cur_dis,cur_node = hq.heappop(q)

        if min_dis[cur_node] < cur_dis:
            continue

        for next_node,next_dis in graph[cur_node]:
            if min_dis[next_node] > cur_dis + next_dis:
                min_dis[next_node] = cur_dis + next_dis
                hq.heappush(q,[next_dis+cur_dis,next_node])
    return min_dis

n,m,x = map(int,input().split())
graph = [[] for _ in range(n+1)]
for _ in range(m):
    a,b,c = map(int,input().split())
    graph[a].append([b,c])
    graph[b].append([a,c])

k = dijkstra(x) # 목적지에서부터 각각의 농장까지의 최단경로 구해주기
result = -float('inf')
for i in range(1,n+1): # 가장 먼 목장을 result로 선정
    if k[i] > result:
        result = k[i]
print(result*2) # 왕복거리를 출력
