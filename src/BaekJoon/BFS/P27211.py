import sys
sys.setrecursionlimit(1 << 25)  # 재귀 깊이 제한 확장 (필요한 경우)

def main():
    import sys
    input = sys.stdin.read
    data = input().split()

    idx = 0
    a = int(data[idx])
    idx += 1
    b = int(data[idx])
    idx += 1

    area = []
    for _ in range(a):
        row = list(map(int, data[idx:idx+b]))
        idx += b
        area.append(row)

    visit = [[0]*b for _ in range(a)]
    directions = [(-1,0), (0,-1), (1,0), (0,1)]
    result = 0

    def dfs(x, y):
        for dx, dy in directions:
            nx = (x + dx) % a  # Torus 효과 적용
            ny = (y + dy) % b
            if area[nx][ny] == 0 and visit[nx][ny] == 0:
                visit[nx][ny] = 1
                dfs(nx, ny)

    for i in range(a):
        for j in range(b):
            if area[i][j] == 0 and visit[i][j] == 0:
                visit[i][j] = 1  # 시작 지점 방문 표시
                dfs(i, j)
                result += 1

    print(result)

if __name__ == "__main__":
    main()
