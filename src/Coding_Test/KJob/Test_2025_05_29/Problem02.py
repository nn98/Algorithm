import sys
readline = sys.stdin.readline

N = int(readline())
plate = []

def find_max(i,j):
    result = 0
    if j < 1:
        result = max(max_val[i+1][j],max_val[i+1][j+1])
    elif j > 1:
        result = max(max_val[i+1][j],max_val[i+1][j-1])
    else:
        result = max(max_val[i+1][j],max_val[i+1][j+1],max_val[i+1][j-1])
    return result

def find_min(i,j):
    result = 0
    if j < 1:
        result = min(min_val[i+1][j],min_val[i+1][j+1])
    elif j > 1:
        result = min(min_val[i+1][j],min_val[i+1][j-1])
    else:
        result = min(min_val[i+1][j],min_val[i+1][j+1],min_val[i+1][j-1])
    return result


for _ in range(N):
    plate.append(list(map(int,readline().split())))
max_val = [[0]*3 for _ in range(N)]
min_val = [[0]*3 for _ in range(N)]

for i in range(3):
    max_val[N-1][i] = plate[N-1][i]
    min_val[N-1][i] = plate[N-1][i]

for i in range(N-2, -1, -1):
    for j in range(3):
        max_val[i][j] = plate[i][j] + find_max(i,j)
        min_val[i][j] = plate[i][j] + find_min(i,j)

print(max(max_val[0]), min(min_val[0]))