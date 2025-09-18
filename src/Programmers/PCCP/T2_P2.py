from collections import deque
def solution(land):
    answer = 0
    height = len(land)
    width = len(land[0])
    visited = [[0] * width for _ in range(height)]
    oil_set = {}
    nX = [1,0,-1,0]
    nY = [0,1,0,-1]

    def bfs(i, j, set_count):
        size = 1
        q = deque()
        q.append((i, j))
        visited[i][j] = set_count
        while q:
            x, y = q.popleft()
            for idx in range(4):
                next_x = x + nX[idx]
                next_y = y + nY[idx]
                if next_x >= 0 and next_x < height and next_y >=0 and next_y < width and not visited[next_x][next_y] and land[next_x][next_y]:
                    visited[next_x][next_y] = set_count
                    size += 1
                    q.append((next_x, next_y))
        # print('\n'.join(map(str, visited)), '\n')
        oil_set[set_count] = size

    set_count = 1

    for j in range(width):
        oils = 0
        history = []
        for i in range(height):
            if land[i][j]:
                if not visited[i][j]:
                    bfs(i, j, set_count)
                    set_count += 1
                if visited[i][j] not in history:
                    history.append(visited[i][j])
                    oils += oil_set[visited[i][j]]
                # if i > 0 and visited[i][j] == visited[i-1][j]:
                #     continue
                # oils += visited[i][j]
        answer = max(answer, oils)

    return answer

# 매칭 테이블 등 자료구조 / 메모리 활용