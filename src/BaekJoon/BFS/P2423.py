import sys
import collections

input = sys.stdin.readline
dy = [1, 1, -1, -1]
dx = [1, -1, -1, 1]

def BFS():
    if (N + M) % 2:
        return "NO SOLUTION"
    visited = [[0] * (M + 1) for i in range(N + 1)]
    dq = collections.deque([(0, 0, 0)])
    while dq:
        y, x, d = dq.popleft()
        if visited[y][x]:
            continue
        visited[y][x] = 1
        if y == N and x == M:
            return d
        for i in range(4):
            y1, x1 = y + dy[i], x + dx[i]
            if N >= y1 >= 0 and M >= x1 >= 0 and not visited[y1][x1]:
                if not (i + board[y - int(dy[i] < 0)][x - int(dx[i] < 0)]) % 2:
                    dq.appendleft((y1, x1, d))
                else:
                    dq.append((y1, x1, d + 1))

N, M = map(int, input().split())

board = [[*map(lambda x: 1 if x == "/" else 0, input().strip())] for i in range(N)]
print(BFS())
