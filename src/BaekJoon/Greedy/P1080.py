import sys
readline = sys.stdin.readline

def reversal(i, j):
    for x in range(i, i+3):
        for y in range(j, j+3):
            arr1[x][y] = '1' if arr1[x][y] == '0' else '0'
            

n, m = map(int, readline().split())
arr1 = [list(readline().strip()) for _ in range(n)]
arr2 = [list(readline().strip()) for _ in range(n)]

if n < 3 and m < 3 and arr1 != arr2:
    ans = -1
else:
    ans = 0

for i in range(n-2):
    for j in range(m-2):
        if arr1[i][j] != arr2[i][j]:
            reversal(i, j)
            ans += 1

print(ans)