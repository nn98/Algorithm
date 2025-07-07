import sys
readline = sys.stdin.readline

X = [-1, 0, 1, 0]
Y = [0, 1, 0, -1]
ans = 0

def main():
    n, m = map(int,readline().split())
    r, c, d = map(int,readline().split())
    room = [readline().split() for _ in range (n)]
    while True:
        r, c, d = checkNext(room, r, c, d)
        if r < 0:
            break
    print(ans)

def checkNext(room, x, y, F):
    # print(x, y, F)
    global ans
    if room[x][y] == '0':
        ans += 1
        room[x][y] = '2'
    isReachable = reachSpace(room, x, y)
    # print('\t', isReachable)
    if isReachable:
        F -= 1
        F %= 4
        if next(room, x, y, F):
            return x + X[F], y + Y[F] , F
        else:
            return x, y, F
    else:
        # print('\t\t', isWallBehind(room, x, y, F))
        if isWallBehind(room, x, y, F):
            return -1,-1,-1
        else:
            return x - X[F], y - Y[F] , F

def reachSpace(room, x, y):
    X = [-1, 0, 1, 0]
    Y = [0, 1, 0, -1]
    result = False
    for i in range(4):
        nextX = x + X[i]
        nextY = y + Y[i]
        result = result or (0 <= nextX < len(room) and 0 <= nextY < len(room[x]) and room[nextX][nextY] == '0')
        if result: return result
    return result

def isWallBehind(room, x, y, F):
    nextX =  x - X[F]
    nextY =  y - Y[F]
    if 0 <= nextX < len(room) and 0 <= nextY < len(room[x]):
        return room[nextX][nextY] == '1'
    return False

def next(room, x, y, F):
    nextX =  x + X[F]
    nextY =  y + Y[F]
    return 0 <= nextX < len(room) and 0 <= nextY < len(room[x]) and room[nextX][nextY] == '0'

if __name__ == "__main__":
    main()
