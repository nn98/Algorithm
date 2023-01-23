t = int(input())
num = 0
for i in range(t):
    n = int(input())
    num += (n // 10) ** (n % 10)
print(num)