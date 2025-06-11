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
    dp = [[int(-1e9)]*2 for _ in range(n)]
    visit = [False]*n
    circuit = deque()
    circuit.append((0, -1, -1))
    visit[0] = True
    q = [(0, -1, -1)]
    while len(q) < n:
        now, before, b_before = circuit.popleft()
        for next_node in conn[now]:
            if not visit[next_node]:
                visit[next_node] = True
                circuit.append((next_node, now, before))
                q.append((next_node, now, before))
    # while q:
    #     now, before, b_before = q.popleft()
    #     visit[now] = True
    #     if before == -1:
    #         dp[now][0] = 0
    #         dp[now][1] = population[now]
    #     else:
    #         dp[now][0] = max(dp[before][1], 0 if b_before == -1 else dp[b_before][1])
    #         dp[now][1] = population[now] + dp[before][0]
    #     for next_node in conn[now]:
    #         if not visit[next_node]:
    #             q.append((next_node, now, before))
        # print('\n'.join(map(str, dp))+'\n')
    # print('\n'.join(map(str, dp)))
    print(q)

if __name__ == '__main__':
    main()
