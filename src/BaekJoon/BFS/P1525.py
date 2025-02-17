import sys
from heapq import heappush, heappop
readline = sys.stdin.readline

def main():
    start = ''.join(''.join(readline().rstrip().split()) for _ in range(3))
    end = '123456780'
    dist = {start: 0}
    q = []
    heappush(q, (dist[start], start))
    while q:
        state, count = heappop(q)
        if dist[state] < count: continue
        if state == end:
            print(count)
            return
        for next in find_case(state):
            if next in dist and dist[next] < count + 1:
                continue
            dist[next] = count + 1
            heappush(q, (dist[next], next))

    print(dist[end])

def find_case(state):
    idx = state.index('0')
    ans = []
    row = idx // 3
    col = idx % 3
    if row > 0:
        temp = state
        temp[idx], temp[idx + 3] = temp[idx + 3], temp[idx]
        ans.append(temp)
    if row < 2:
        temp = state
        temp[idx], temp[idx - 3] = temp[idx - 3], temp[idx]
        ans.append(temp)
    if col > 0:
        temp = state
        temp[idx], temp[idx - 1] = temp[idx - 1], temp[idx]
        ans.append(temp)
    if col < 2:
        temp = state
        temp[idx], temp[idx + 1] = temp[idx + 1], temp[idx]
        ans.append(temp)
    return ans

if __name__ == '__main__':
    main()
