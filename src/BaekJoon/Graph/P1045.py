import sys
import heapq

readline = sys.stdin.readline
n, m = map(int, readline().split())
matrix = []
for i in range(n):
    matrix.append(list(readline().rstrip()))
visit = [0] * n
q_size = 0

q = []
for i in range(n):
    if q: break
    for j in range(n):
        if matrix[i][j] == 'Y':
            heapq.heappush(q, (i, j))
            visit[i] += 1
            visit[j] += 1
            matrix[i][j] = matrix[j][i] = 'N'
            q_size += 1

while 0 in visit:
    # print('visit:', visit,'\nq_size:', q_size,'\nq:',q)
    if q_size == m or not q: break
    start, end = heapq.heappop(q)
    for i in range(n):
        if matrix[end][i] == 'Y' and visit[i] == 0:
            heapq.heappush(q, (end, i))
            visit[end] += 1
            visit[i] += 1
            matrix[end][i] = matrix[i][end] = 'N'
            q_size += 1

for i in range(n):
    if q_size == m: break
    for j in range(n):
        if matrix[i][j] == 'Y':
            visit[i] += 1
            visit[j] += 1
            matrix[i][j] = matrix[j][i] = 'N'
            q_size += 1
            if q_size == m: break

if q_size == m:
    if 0 in visit:
        print(-1)
    else:
        print(' '.join(map(str, visit)))
else:
    print(-1)

