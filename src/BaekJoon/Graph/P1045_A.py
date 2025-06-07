import sys
from heapq import heappush, heappop

def main():
    readline = sys.stdin.readline
    n, m = map(int, readline().split())
    road = []
    # matrix = [list(readline().rstrip()) for _ in range(n)] 문자열 == 배열이라 리스트로 나눌 필요가 없다
    matrix = [sys.stdin.readline().strip() for _ in range(n)]

    for i in range(n):
        for j in range(i+1, n):
            if matrix[i][j] == 'Y':
                heappush(road, (i, j))
                # matrix[j][i] = 'N' j값을 i+1부터 해주면 굳이 반대방향 안없애도 방지 가능

    if len(road) < m:
        print(-1)
        return

    parent = list(range(n))
    def find(node):
        while parent[node] != node:
            parent[node] = parent[parent[node]]
            node = parent[node]
        return node

    count = 0
    adds = []
    temp_road = []
    # while count < n-1: 도로 부족하면 끊어야 오류안나고 아래서 오답판정
    while road and count < n-1:
        a, b = heappop(road)
        p_a = find(a)
        p_b = find(b)
        if p_a != p_b:
            parent[p_b] = p_a
            count += 1
            adds.append((a, b))
        # adds.append((a, b)) 연결된 정점(부모 동일)이면 스킵, 다를 경우에만 append
        else:
            temp_road.append((a, b))
    if count < n-1:
        print(-1)
        return

    while road:
        temp_road.append(heappop(road))
    remain = m - (n - 1)
    adds += temp_road[:remain]

    # 연결성을 재검증해야되나? 왜요?
    parent = list(range(n))
    for a, b in adds:
        p_a = find(a)
        p_b = find(b)
        if p_a != p_b:
            parent[p_b] = p_a
    root = find(0)
    if any(root != find(i) for i in range(n)):
        print(-1)
        return

    endpoint = [0] * n
    for a, b in adds:
        endpoint[a] += 1
        endpoint[b] += 1
    print(' '.join(map(str, endpoint)))

if __name__ == '__main__':
    main()
