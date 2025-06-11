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
    dp = [[0]*n for _ in range(2)]
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
            dp[0][now] += max(dp[0][child], dp[1][child])
            dp[1][now] += dp[0][child]
        dp[1][now] += population[now]

    print('\n'.join(map(str, dp)))

if __name__ == '__main__':
    main()
