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
    dp = [[int(-1e9)]*n for _ in range(2)]
    visit = [False]*n
    q = deque()
    q.append((0,-1,-1))
    while q:
        now, before, b_before = q.popleft()
        visit[now] = True
        if before == -1:
            dp[now][0] = 0
            dp[now][1] = population[now]
        else:
            dp[now][0] = max(dp[before][1], 0 if b_before == -1 else dp[b_before][1])
            dp[now][1] = population[now] + dp[before][0]
        for next in conn[now]:
            if not visit[next]:
                q.append((next, now, before))
    print('\n'.join(map(str, dp)))

if __name__ == '__main__':
    main()
