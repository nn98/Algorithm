import sys
from collections import deque

readline = sys.stdin.readline

next_X = [0, 1, 0, -1]
next_Y = [1, 0, -1, 0]

def main():
    n = int(readline())
    area = [list(map(int, readline().split())) for _ in range(n)]

    # 최대 높이 계산
    max_val = max(map(max, area))
    answer = 0

    # 0부터 최대 높이까지 모든 경우의 수 검사
    for rain_height in range(0, max_val + 1):
        visited = [[False] * n for _ in range(n)]
        now = 0

        for i in range(n):
            for j in range(n):
                if area[i][j] > rain_height and not visited[i][j]:
                    now += 1
                    q = deque([(i, j)])
                    visited[i][j] = True  # 시작점 즉시 방문 표시

                    while q:
                        x, y = q.popleft()
                        for k in range(4):
                            nx, ny = x + next_X[k], y + next_Y[k]
                            if 0 <= nx < n and 0 <= ny < n:
                                if area[nx][ny] > rain_height and not visited[nx][ny]:
                                    visited[nx][ny] = True  # 방문 표시를 큐에 넣을 때 수행
                                    q.append((nx, ny))

        answer = max(answer, now)

    print(answer)

if __name__ == "__main__":
    main()
