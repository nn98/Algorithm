n, m = map(int,input().split())
puzzle = [input() for _ in range(n)]
hist_vertical = [[False for _ in range(m)] for _ in range(n)]
hist_horizontal = [[False for _ in range(m)] for _ in range(n)]
words = []

def vertical(x, y):
    result = []
    for idx in range(x, n):
        if puzzle[idx][y] == '#':
            break
        result.append(puzzle[idx][y])
        hist_vertical[idx][y] = True

    if len(result) > 1:
        words.append(''.join(result) )

def horizontal(x, y):
    result = []
    for idx in range(y, m):
        if puzzle[x][idx] == '#':
            break
        result.append(puzzle[x][idx])
        hist_horizontal[x][idx] = True

    if len(result) > 1:
        words.append(''.join(result) )

for i in range(n):
    for j in range(m):
        if puzzle[i][j] != '#':
            if not hist_vertical[i][j]:
                vertical(i, j)
            if not hist_horizontal[i][j]:
                horizontal(i, j)

words.sort()
print(words[0])
