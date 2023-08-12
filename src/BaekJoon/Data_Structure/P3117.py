import sys,math
input = sys.stdin.readline

N,K,M = map(int,input().split())
student = [*map(int,input().split())]

sparse = [[0]+[*map(int,input().split())]]+[[0]*(K+1) for i in range(30)]
for i in range(1,31):
  for k in range(1,K+1):
    sparse[i][k] = sparse[i-1][sparse[i-1][k]]
for i in range(31):
  if (1<<i)&(M-1):
    for n in range(N):
      student[n] = sparse[i][student[n]]
print(*student)
