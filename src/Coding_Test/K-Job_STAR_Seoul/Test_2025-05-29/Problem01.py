import sys
readline = sys.stdin.readline

N, K = map(int,readline().split())
time = []
for i in range(N):
    time.append(int(readline()))
time.sort()
turm = [time[0]]
turm_sorted = [time[0]]
for i in range(1,N):
    turm.append(time[i]-time[i-1])
    turm_sorted.append(time[i]-time[i-1])

turm.append(1)
turm_sorted.sort(reverse=True)

for i in range(K-1):
    turm[turm.index(turm_sorted[i])] = 0

add = 0
ans = 0
for i in range(len(turm)):
    if turm[i] == 0:
        ans += add
        add = 0
    else:
        add += turm[i]

ans += add
print(ans)

# 8 3
# 1
# 5
# 4
# 12
# 9
# 17
# 22
# 15