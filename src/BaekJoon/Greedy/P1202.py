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
bags.sort(reverse=True)

ans = 0
for weight, value in jewels:
    if not bags: break
    for bag in bags:
        print(weight, value, bag)
        if weight <= bag:
            ans += value
            bags.remove(bag)
            break
print(ans)
