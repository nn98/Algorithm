n, m, k = map(int, input().split())
farm = [0 for i in range(n)]
for i in range(m):
    t, r = map(int, input().split())
    farm[0] += r
    if farm[0] > k:
        print(i + 1, 1)
        exit()
print(-1)
# python3 로는 100,000 10만번도 시간초과가 나나
