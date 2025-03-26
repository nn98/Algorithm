import sys
readline = sys.stdin.readline

N = int(readline())
tasks = []
for i in range(N):
    a, b = map(int, readline().split())
    tasks.append([a, b])

print(tasks)
tasks.sort(key = lambda x: (x[0], -x[1]))
print(tasks)
