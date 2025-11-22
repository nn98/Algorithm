import math

T = int(input())
for i in range(T):
    N = int(input())
    target = input()
    K = int(input())
    target_strings = {}
    for t in target:
        target_strings[t] = target_strings.get(t, 0) + 1
    K -= len(target_strings)
    target_count = target_strings.values()
    sol = [1] * len(target_strings)
    temp = list(target_count)
    while K:
        cop = []
        for j in range(len(temp)):
            cop.append(temp[j] - sol[j])
        max_idx = cop.index(max(cop))
        sol[max_idx] += 1
        K -= 1
    divides = []
    for x in range(len(sol)):
        divides.append(math.ceil(temp[x] / sol[x]))
    print('#%d %d' % (i+1, max(divides)))
