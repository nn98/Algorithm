import sys
from heapq import heappush, heappop

readline = sys.stdin.readline

def main():
    n = int(readline())
    # arr = list(int(x)-1 for x in readline().split())
    # print(arr)
    arr = [int(x)-1 for x in readline().split()]
    arr_str = ''.join(map(str, arr))
    arr.sort()
    arr_ans = ''.join(map(str, arr))
    if arr_str == arr_ans:
        print(0)
        return

    m = int(readline())
    operation = []
    for i in range(m):
        l,r,c = list(int(x)-1 for x in readline().split())
        operation.append((l,r,c+1))
    # case = set()

    q = []
    heappush(q,(0,arr_str))
    dist = {arr_str:0}

    while q:
        cost, state = heappop(q)
        if state == arr_ans:
            print(cost)
            return
        if dist[state] < cost:
            continue
        for l, r, c in operation:
            lst = list(state)
            lst[l], lst[r] = lst[r], lst[l]
            new_state = ''.join(lst)
            new_cost = cost + c
            if new_state not in dist or new_cost < dist[new_state]:
                dist[new_state] = new_cost
                heappush(q, (new_cost, new_state))
    print(-1)

if __name__ == '__main__':
    main()
