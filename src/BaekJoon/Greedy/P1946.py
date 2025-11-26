import sys
readline = sys.stdin.readline

T = int(readline())
while T > 0:
    N = int(readline())
    applied = []
    for i in range(N):
        paper, interview = map(int, readline().split())
        applied.append((paper, interview))

    applied.sort(key = lambda x:x[0])
    min_interview = applied[0][1]
    result = 1
    for paper, interview in applied:
        if interview < min_interview:
            result += 1
            min_interview = interview

    print(result)
    T -= 1
