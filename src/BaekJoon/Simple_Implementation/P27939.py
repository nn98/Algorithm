n = int(input())
eggPlant = input().split()
ass, assEP = map(int, input().split())
purpleCount = 0
for _ in range(ass):
    res = 0
    for i in map(int, input().split()):
        if eggPlant[i - 1] == 'P':
            res = 1
            break
    purpleCount += res
print('P' if ass == purpleCount else 'W')