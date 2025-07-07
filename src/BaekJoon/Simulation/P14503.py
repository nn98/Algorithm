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
    if room[x][y] == '0': ans += 1
    isReachable = reachSpace(room, x, y)
    if isReachable:
        F -= 1
        F %= 4
        if next:
            return x + X[F], y + Y[F] , F
        else:
            return x, y, F
    else:
        if isWallBehind(room, x, y, F):
            return x - X[F], y - Y[F] , F
        else:
            return -1,-1,-1

def reachSpace(room, x, y):
    X = [-1, 0, 1, 0]
    Y = [0, 1, 0, -1]
    result = False
    for i in range(4):
        nextX = x + X[i]
        nextY = y + Y[i]
        result = result or (0 <= nextX < len(room) and 0 <= nextY < len(room[x]) and room[nextX][nextY] == '0')
        if result: return result

def isWallBehind(room, x, y, F):
    nextX =  x - X[F]
    nextY =  y - X[F]
    return 0 <= nextX < len(room) and 0 <= nextY < len(room[x]) and room[nextX][nextY] == '1'

def next(room, x, y, F):
    nextX =  x + X[F]
    nextY =  y + X[F]
    return 0 <= nextX < len(room) and 0 <= nextY < len(room[x]) and room[nextX][nextY] == '0'

if __name__ == "__main__":
    main()
