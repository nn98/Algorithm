import sys
from collections import deque

def main():
    N, T = map(int, sys.stdin.readline().split())
    times = list(map(int, sys.stdin.readline().split()))

    solve_times = [0] * N
    q = deque()
    for i in range(N):
        if times[i] > 0:
            q.append(i)

    total_time = 0
    while q:
        current_cycle_size = len(q)
        for _ in range(current_cycle_size):
            i = q.popleft()
            spend = min(times[i], T)
            total_time += spend
            times[i] -= spend
            if times[i] == 0:
                solve_times[i] = total_time
            else:
                q.append(i)

    print(' '.join(map(str, solve_times)))

if __name__ == "__main__":
    main()
