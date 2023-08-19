n = int(input())
arr = []

for i in range(1, n+1):
    a, b = map(float, input().split())
    arr.append((a / b, i))

arr.sort()

for i in range(n):
    print(arr[i][1], end=' ')
