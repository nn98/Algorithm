import sys

readline = sys.stdin.readline

n, m = map(int, readline().split())

memory = list(map(int, readline().split()))
disable = list(map(int, readline().split()))

arr = []

for mem, dis in zip(memory, disable):
    arr.append((mem, dis))

mem_arr = sorted(arr, key=lambda x: x[0])
dis_arr = sorted(arr, key=lambda x: x[1])

answer = 1e9

dp = [0] * (sum(disable) + 1)

def sol(index, resource, mem):
    print(index, resource, mem)
    if mem < dp[resource]:
        return
    dp[resource] = mem
    global answer
    if mem >= m:
        answer = min(answer, resource)
        return
    if index == n:
        return
    if dis_arr[index][1] != 0 and dp[resource] < mem:
        sol(index + 1, resource, mem)
    if dp[resource + dis_arr[index][1]] < mem + dis_arr[index][0]:
        sol(index + 1, resource + dis_arr[index][1], mem + dis_arr[index][0])

sol(0, 0, 0)

print(answer)
