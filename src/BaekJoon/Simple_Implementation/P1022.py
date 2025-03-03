import sys

readline = sys.stdin.readline
size = 52
half = size // 2
matrix = [[0] * size for _ in range(size)]

for i in range(half, size):
    line = 1 if i == half else 1 + (i - half) * 2
    minus = 0
    for j in range(i, i+line):
        val = -1
        if i == j:
            if i == half:
                val = 1
            else:
                val = line * line
        else:
            val = line * line - minus // 2
        matrix[i][j - minus] = val
        val -= (i - half) * 4
        matrix[size-i][size-j+minus] = val
        minus += 2


print('\n'.join(' '.join(map(str, matrix[i])) for i in range(size)))

r1,c1,r2,c2 = map(lambda x: x+half, map(int,readline().split()))
p_matrix = [row[c1:c2+1] for row in matrix[r1:r2+1]]
print(max(p_matrix))

print(p_matrix)