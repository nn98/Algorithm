n = int(input())
for i in range(n):
    time = int(input())
    print('ONLINE' if time % 25 < 17 else 'OFFLINE')