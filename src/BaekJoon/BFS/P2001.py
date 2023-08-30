n, m, k = map(int, input().split())

INF = 99999999
adj = [[] for _ in range(101)]
visit = [[False] * 101 for _ in range(1 << 16)]
gem = [-1] * 101
answer = 0

def get_dp(state, cur, cnt):
    global answer
    visit[state][cur] = True
    if cur == 1:
        answer = max(answer, cnt)

    for nextnode, weight in adj[cur]:
        if not visit[state][nextnode] and weight >= cnt:
            get_dp(state, nextnode, cnt)

        if gem[cur] != -1:
            if state & (1 << gem[cur]):
                continue
            nextstate = state | (1 << gem[cur])
            next_gem = cnt + 1

            if not visit[nextstate][nextnode] and weight >= next_gem:
                get_dp(nextstate, nextnode, next_gem)

def init():
    global gem, adj, visit
    gem = [-1] * 101
    for i in range(k):
        f = int(input())
        gem[f] = i

    for i in range(m):
        f, s, w = map(int, input().split())
        adj[f].append((s, w))
        adj[s].append((f, w))

    visit = [[False] * 101 for _ in range(1 << 16)]

init()
adj[1].append((1, 100))
get_dp(0, 1, 0)

print(answer)
