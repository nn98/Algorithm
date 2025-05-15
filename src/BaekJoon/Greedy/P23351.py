import sys
N, K, A, B = map(int, sys.stdin.readline().split())
pot = [K] * N
day = 0
while min(pot)-day:
    start = pot.index(min(pot))
    for i in range(A):
        if i + start >= N:
            break
        pot[i+start] += B
    day += 1

print(pot)
print(day)