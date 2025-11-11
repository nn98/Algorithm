import sys

readline = sys.stdin.readline

n, m = map(int, readline().split())

memory = list(map(int, readline().split()))
disable = list(map(int, readline().split()))

arr = []

for mem, dis in zip(memory, disable):
    arr.append((mem, dis))

answer = 1e9

dp = [0] * (sum(disable) + 1)

def sol(index, resource, mem):
    if mem < dp[resource]:
        return
    dp[resource] = mem
    global answer
    if mem >= m:
        answer = min(answer, resource)
        return
    if index == n:
        return
    sol(index + 1, resource, mem)
    sol(index + 1, resource + disable[index], mem + memory[index])

sol(0, 0, 0)

print(answer)
