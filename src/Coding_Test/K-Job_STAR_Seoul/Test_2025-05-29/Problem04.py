import sys
readline = sys.stdin.readline

N, T = map(int,readline().split())
time = list(map(int,readline().split()))
ans = [0] * N
repeat = 1
while 0 in ans:
    for i in range(N):
        if
    # print('i:',i,'repeat:',repeat,'T*repeat:',T*repeat,'time[i] / (T*repeat):',(time[i] / (T*repeat)), 'T*repeat - (time[i]%T):',T*repeat - (time[i]%T))
    # if ans[i] == 0 and time[i] / (T*repeat) <= 1:
    #     ans[i] = (0 if i == 0 else i-1) *repeat + (time[i]%T)

    print(ans)
    repeat += 1
    if repeat > 10:break

for i in range(N):
    print(ans[i],end=' ')