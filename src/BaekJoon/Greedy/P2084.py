import sys
input = sys.stdin.readline

N = int(input())
deg = list(map(int, input().rstrip().split()))
if sum(deg) % 2:
    print(-1)
    exit(0)
matrix = [[0 for _ in range(N)] for _ in range(N)]
while True:
    ordered_vertex = sorted(range(N), key = lambda x: deg[x], reverse = True)
    largest_vertex_num = ordered_vertex[0]
    largest_degree = deg[largest_vertex_num]
    if largest_degree == 0:
        break
    for i in range(1, largest_degree+1):
        if i >= N:
            print(-1)
            exit(0)
        vertex_num = ordered_vertex[i]
        if deg[vertex_num] == 0:
            print(-1)
            exit(0)
        deg[vertex_num] -= 1
        deg[largest_vertex_num] -= 1
        matrix[vertex_num][largest_vertex_num] = 1
        matrix[largest_vertex_num][vertex_num] = 1
for i in range(N):
    print(*matrix[i])
