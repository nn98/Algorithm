import heapq
def solution(board):
    x, y = len(board), len(board[0])
    history = [[1e9] * y for _ in range(x)]
    find_start = False
    find_end = False
    for i in range(x):
        if find_start and find_end: break
        for j in range(y):
            if board[i][j] == 'R':
                start = (0,i,j)
                find_start = True
            if board[i][j] == 'G':
                end = (i,j)
                find_end = True

    move = [[0,1],[1,0],[0,-1],[-1,0]]
    def move_case(now_x, now_y, case):
        nx, ny = now_x, now_y
        while 0 <= nx < x and 0 <= ny < y and board[nx][ny] != 'D':
            nx += move[case][0]
            ny += move[case][1]
        nx -= move[case][0]
        ny -= move[case][1]
        # print(now_x, now_y, nx, ny)
        return nx, ny

    q = []
    heapq.heappush(q,start)

    while q:
        dist, now_x, now_y = heapq.heappop(q)
        if history[now_x][now_y] < dist:
            continue
        history[now_x][now_y] = dist
        for case in range(4):
            next_x, next_y = move_case(now_x, now_y, case)
            if history[next_x][next_y] < dist + 1:
                continue
            heapq.heappush(q,(dist+1,next_x,next_y))
            history[next_x][next_y] = dist+1

    # print('\n'.join(' '.join(map(str,h)) for h in history))

    answer = history[end[0]][end[1]]

    return answer if answer != 1e9 else -1

print(solution(["...D..R", ".D.G...", "....D.D", "D....D.", "..D...."]))
print(solution([".D.R", "....", ".G..", "...D"]))