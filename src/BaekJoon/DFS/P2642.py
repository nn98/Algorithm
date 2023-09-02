from collections import deque

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
rk = [1, 0, 3, 2]

dice_map = [deque([0]*3) for _ in range(4)]
map_list = [list(map(int, input().split())) for _ in range(6)]
visited = [False]*7

def dice_move(k):
    if k == 0:
        dice_map[1][0], dice_map[1][1], dice_map[1][2], dice_map[3][1] = dice_map[1][1], dice_map[1][2], dice_map[3][1], dice_map[1][0]
    elif k == 1:
        dice_map[1][0], dice_map[1][1], dice_map[1][2], dice_map[3][1] = dice_map[3][1], dice_map[1][0], dice_map[1][1], dice_map[1][2]
    elif k == 2:
        dice_map[0][1], dice_map[1][1], dice_map[2][1], dice_map[3][1] = dice_map[1][1], dice_map[2][1], dice_map[3][1], dice_map[0][1]
    else:
        dice_map[0][1], dice_map[1][1], dice_map[2][1], dice_map[3][1] = dice_map[3][1], dice_map[0][1], dice_map[1][1], dice_map[2][1]

def dfs(x, y):
    visited[map_list[y][x]] = True
    if dice_map[1][1] != 0:
        return False, 0
  
    dice_map[1][1] = map_list[y][x]
    result, cnt = True, 1
    for k in range(4):
        ax, ay = x + dx[k], y + dy[k]
        if -1 < ax < 6 and -1 < ay < 6 and map_list[ay][ax] > 0 and not visited[map_list[ay][ax]]:
            dice_move(k)
            _result, _cnt = dfs(ax, ay)
            result &= _result
            cnt += _cnt
            dice_move(rk[k])

    return result, cnt

def search():
    for i in range(6):
        for j in range(6):
            if map_list[i][j] == 1:
                return dfs(j, i)

    return False, 0

def solve():
    is_valid, cnt = search()
    print(0 if not is_valid or cnt != 6 else dice_map[3][1])
    return
  
solve()
