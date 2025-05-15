import sys
readline = sys.stdin.readline

def calculating_change(change):
    changes = []
    coin = [25,10,5,1]
    for i in range(len(coin)):
        changes.append(int((change / coin[i])))
        change %= coin[i]
    return changes

for i in range(int(readline())):
    change = int(readline())
    print(' '.join(map(str,calculating_change(change))))
