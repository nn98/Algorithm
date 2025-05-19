import sys
readline = sys.stdin.readline
lucky = [1]
remove = []
count = 2
for i in range(3,10**5+1,2):
    isLucky = True
    for j in remove:
        if count % j == 0:
            isLucky = False
    if isLucky:
        lucky.append(i)
        remove.append(i)
    print(lucky)
    count += 1

