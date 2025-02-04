import sys
from collections import deque
readline = sys.stdin.readline

def main():
    T = int(readline())
    for i in range(T):
        n, m = map(int,readline().split())
        matrix = [readline().rstrip() for _ in range(n)]
        print(matrix)
        val = [0] * m
        for row in matrix:
            for j in range(m):
                if row[j] == '.':
                    val[j] += 1
        print(val)
        his = [0] * m
        q = deque()
        for j in range(m):
            if his[j] < val[j]:
                q.append((j,0))
            while q:
                idx, value = q.popleft()
                if his[idx] > value: continue
                value += val[idx]
                print(his)
                his[idx] = value
                if idx + 2 < m and his[idx + 2] < value:
                    q.append((idx + 2, value))
                if idx + 3 < m and his[idx + 3] < value:
                    q.append((idx + 3, value))
        print(his)

if __name__ == "__main__":
    main()
