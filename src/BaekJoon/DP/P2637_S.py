import sys
from collections import deque, defaultdict

def main():
    input = sys.stdin.readline
    n = int(input())
    m = int(input())
    parts = [[] for _ in range(n)]
    indegree = [0] * n

    for _ in range(m):
        x, y, k = map(int, input().split())
        parts[y-1].append((x-1, k))  # y로 x를 만드는데 k개 필요
        indegree[x-1] += 1

    need = [[0]*n for _ in range(n)]
    q = deque()

    for i in range(n):
        if indegree[i] == 0:
            q.append(i)
            need[i][i] = 1

    while q:
        now = q.popleft()
        for nxt, cnt in parts[now]:
            for i in range(n):
                need[nxt][i] += need[now][i] * cnt
            indegree[nxt] -= 1
            if indegree[nxt] == 0:
                q.append(nxt)

    for i in range(n):
        if need[n-1][i]:
            print(i+1, need[n-1][i])

if __name__ == "__main__":
    main()
