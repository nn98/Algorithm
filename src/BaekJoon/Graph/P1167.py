import sys
from heapq import heappush, heappop
readline = sys.stdin.readline

def main():
    n = int(readline())
    roads = [[] for _ in range(n)]
    for i in range(n):
        road = list(map(int,readline().split()))
        for j in range(1,len(road)-1,2):
            roads[road[0]-1].append((road[j]-1,road[j+1]))
    q = []
    dist = [[int(1e9)] * n for _ in range(2)]
    dist[0][0] = 0
    heappush(q,(0,0))
    while q:
        value, node = heappop(q)
        if dist[0][node] < value:
            continue
        for n_node, n_value in roads[node]:
            if dist[0][n_node] > value+n_value:
                dist[0][n_node] = value+n_value
                heappush(q, (value+n_value, n_node))
    # print(dist)

    m_value = max(dist[0])
    m_node = dist[0].index(m_value)
    dist[1][m_node] = 0
    heappush(q,(0,m_node))
    while q:
        value, node = heappop(q)
        if dist[1][node] < value:
            continue
        for n_node, n_value in roads[node]:
            if dist[1][n_node] > value+n_value:
                dist[1][n_node] = value+n_value
                heappush(q, (value+n_value, n_node))

    print(dist[0])
    print(dist[1])
    print(max(dist[1]))
    # for i in range(1,n-1):
    #     for j in range(i+1,n):
    #         ans = max(ans,dist[i]+dist[j])
    # print(ans)

if __name__ == '__main__':
    main()
