import sys
readline = sys.stdin.readline

N, S = map(int, readline().split())
pics = []
for _ in range(N):
    height, value = map(int, readline().split())
    if height > S:
        pics.append((height, value))
pics.sort(key=lambda x: (x[1], x[0]))
print(pics)
