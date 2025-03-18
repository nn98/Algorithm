import sys
readline = sys.stdin.readline

N, K = map(int, readline().split())
jewels = []
bags = []

for i in range(N):
    a, b = map(int, readline().split())
    jewels.append([a, b])
for i in range(K):
    bags.append(int(readline()))
jewels.sort(key=lambda x: (-x[1], -x[0]))
bags.sort()
# print(jewels)
# print(bags)

ans = 0
while bags:
    for weight, value in jewels:
        if bags[0] >= weight:
            # print(weight, value, bags[0])
            ans += value
            bags.pop(0)
            jewels.remove([weight, value])
            break
print(ans)
