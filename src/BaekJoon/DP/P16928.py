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
    while q:
        now, count = q.popleft()
        if dp[now] < count:
            continue
        count += 1
        for i in range(1,7):
            if now+i > 100: break
            if dp[now+i] > count:
                dp[now+i] = count
                q.append((now+i, count))
                if board[now+i]:
                    dp[board[now+i]] = count
                    q.append((board[now+i], count))
    print(dp[100])

if __name__ == "__main__":
    main()
