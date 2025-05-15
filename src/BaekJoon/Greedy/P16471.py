import sys
readline = sys.stdin.readline
n = int(readline())
player = list(map(int,readline().split()))
player.sort()
master = list(map(int,readline().split()))
master.sort()
print(player)
print(master)
count = 0
for i in range(n):
    # for j in range(len(master)):
    #     if player[i] < master[j]:
    #         master.pop(j)
    #         count += 1
    #         break
    count += 1 if player[i] < master[i] else 0
print('YES' if count >= (n+1)/2 else 'NO')
