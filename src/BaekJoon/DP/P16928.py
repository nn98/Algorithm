import sys
from collections import deque
readline = sys.stdin.readline

def main():
    ladder, snake = map(int,readline().split())
    board = [0] * 101
    dp = [1e9] * 101
    ladders = [map(int,readline().split()) for _ in range(ladder)]
    for start, end in ladders:
        board[start] = end
    snakes = [map(int,readline().split()) for _ in range(snake)]
    for start, end in snakes:
        board[start] = end
    q = deque()
    q.append((1,0))
    dp[1] = 0
    while q:
        now, count = q.popleft()
        if dp[now] < count:
            continue
        count += 1
        for i in range(1,7):
            next_pos = now + i
            if next_pos > 100: continue
            while board[next_pos]:
                next_pos = board[next_pos]
            if dp[next_pos] > count:
                dp[next_pos] = count
                q.append((next_pos, count))
    print(dp[100])

if __name__ == "__main__":
    main()
