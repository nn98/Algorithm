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
    paper_standard = applied[0][0]



    T -= 1