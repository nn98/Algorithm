import sys
from collections import deque
readline = sys.stdin.readline

def main():
    n = int(readline())
    population = list(map(int, readline().split()))
    conn = [[] for _ in range(n)]
    for i in range(n-1):
        a, b = map(lambda x: int(x)-1, readline().split())
        conn[a].append(b)
        conn[b].append(a)
    dp = [[0]*2 for _ in range(n)]
    visit = [False]*n
    circuit = deque()
    circuit.append((0, -1))
    visit[0] = True
    q = [(0, -1)]
    while len(q) < n:
        now, before = circuit.popleft()
        for next_node in conn[now]:
            if not visit[next_node]:
                visit[next_node] = True
                circuit.append((next_node, now))
                q.append((next_node, now))
    while q:
        now, parent = q.pop()
        for child in conn[now]:
            if child == parent: continue
            dp[now][0] += max(dp[child][0], dp[child][1])
            dp[now][1] += dp[child][0]
        dp[now][1] += population[now]

    print(max(dp[0]))

if __name__ == '__main__':
    main()
