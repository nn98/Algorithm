import sys
from collections import deque
readline = sys.stdin.readline

def main():
    # start = ''.join(''.join(readline().rstrip().split()) for _ in range(3))
    start = tuple(int(c) for _ in range(3) for c in readline().rstrip().split())
    end = tuple(map(int,list('123456780')))
    dist = {start: 0}
    q = deque()
    q.append(start)
    while q:
        state = q.popleft()
        # if state in dist and dist[state] < count: continue
        if state == end:
            print(dist[state])
            return
        for next in find_case(state):
            if next not in dist:
                dist[next] = dist[state] + 1
                q.append(next)

    print(-1)

def find_case(state):
    idx = state.index(0)
    ans = []
    row = idx // 3
    col = idx % 3
    if row > 0:
        temp = list(state)
        temp[idx], temp[idx - 3] = temp[idx - 3], temp[idx]
        ans.append(tuple(temp))
    if row < 2:
        temp = list(state)
        temp[idx], temp[idx + 3] = temp[idx + 3], temp[idx]
        ans.append(tuple(temp))
    if col > 0:
        temp = list(state)
        temp[idx], temp[idx - 1] = temp[idx - 1], temp[idx]
        ans.append(tuple(temp))
    if col < 2:
        temp = list(state)
        temp[idx], temp[idx + 1] = temp[idx + 1], temp[idx]
        ans.append(tuple(temp))
    return ans

if __name__ == '__main__':
    main()
