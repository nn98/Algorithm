import sys
from heapq import heappush, heappop
readline = sys.stdin.readline

def main():
    n = int(readline())
    roads = [[] for _ in range(n)]
    for i in range(n):
        road = list(map(int,readline().split()))
        for j in range(1,len(list)-1,2):
            roads[road[0]-1].append((road[j]-1,road[j+1]))
    q = []
    dist = [int(1e9)] * n
    dist[0] = 0
    heappush(q,(0,0))
    while q:
        node, value = heappop(q)
        if dist[node] < value:
            continue
        for n_node, n_value in roads[node]:
            if dist[n_node] < value+n_value:
                dist[n_node] = value+n_value
                heappush(q, (value+n_value, n_node))
    print(dist)

if __name__ == '__main__':
    main()
