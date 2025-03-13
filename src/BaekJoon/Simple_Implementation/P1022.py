import sys

readline = sys.stdin.readline

matrix = [[0] * 101 for _ in range(101)]

for i in range(50, 101):
    line = 1 if i == 50 else 1 + (i - 49) * 2
    for j in range(50, 50+line):
        val = -1
        if i == j:
            if i == 50:
                val = 1
            else:
                val = line * line
        else:
            val = line * line - (i - 50)
        matrix[i][100-j] = val
print(matrix)
