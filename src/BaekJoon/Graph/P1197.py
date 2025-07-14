import sys
input = sys.stdin.readline

# 유니온-파인드(재귀 없이)
def find(parent, x):
    while parent[x] != x:
        parent[x] = parent[parent[x]]  # 경로 압축
        x = parent[x]
    return x

def union(parent, rank, a, b):
    a = find(parent, a)
    b = find(parent, b)
    if a == b:
        return False
    if rank[a] < rank[b]:
        parent[a] = b
    else:
        parent[b] = a
        if rank[a] == rank[b]:
            rank[a] += 1
    return True

V, E = map(int, input().split())
edges = []
for _ in range(E):
    A, B, C = map(int, input().split())
    edges.append((C, A-1, B-1))  # 0-indexed

edges.sort()
parent = [i for i in range(V)]
rank = [0] * V

mst_weight = 0
count = 0
for cost, a, b in edges:
    if union(parent, rank, a, b):
        mst_weight += cost
        count += 1
        if count == V-1:
            break

print(mst_weight)
