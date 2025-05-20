import sys
readline = sys.stdin.readline

n = int(readline())
coordinate = list(map(int,readline().split()))
if n > 1 :
    inRange = list(map(int,readline().split()))
    target = inRange[-1]
    personIdx = 0
    now = 0
    while personIdx < n - 1:
        reach = coordinate[personIdx] + inRange[personIdx]
        next = coordinate[personIdx+1]
        if reach >= next or now >= next:
            personIdx += 1
            now = max(reach, now)
        else :
            print('엄마 나 전역 늦어질 것 같아')
            exit(0)

print('권병장님, 중대장님이 찾으십니다')
