import sys
readline = sys.stdin.readline
n = int(readline())
player = list(map(int,readline().split()))
player.sort(reverse=True)
master = list(map(int,readline().split()))
master.sort()
print(player)
print(master)
i=0
j=n-1
count = 0
while i < n and j >= 0:
    if player[i] < master[j]:
        count += 1
        j-=1
    i+=1
print(count)
print('YES' if count >= (n+1)/2 else 'NO')
