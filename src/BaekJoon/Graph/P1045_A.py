import sys
from heapq import heappush, heappop

def main():
    readline = sys.stdin.readline
    n, m = map(int, readline().split())
    road = []
    matrix = [list(readline().rstrip()) for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if matrix[i][j] == 'Y':
                heappush(road, (i, j))
                matrix[j][i] = 'N'
    if len(road) < m:
        print(-1)
        return

    parent = range(n)
    def find(node):
        while parent[node] != node:
            parent[node] = parent[parent[node]]
            node = parent[node]
        return node

    count = 0
    adds = []
    while count < n-1:
        a, b = heappop(road)
        p_a = find(a)
        p_b = find(b)
        if p_a != p_b: parent[p_b] = p_a
        count += 1
        adds.append((a, b))
    if count < n-1:
        print(-1)
        return

    remain = m - (n - 1)
    temp_road = []
    while count < m:
        a, b = heappop(road)
        p_a = find(a)
        p_b = find(b)
        if p_a != p_b: parent[p_b] = p_a
        count += 1
        adds.append((a, b))

    root = find(0)
    if any(root != parent[i] for i in range(n)):
        print(-1)
        return

    endpoint = [0] * n
    for a, b in adds:
        endpoint[a] += 1
        endpoint[b] += 1
    print(' '.join(map(str, endpoint)))

if __name__ == '__main__':
    main()
