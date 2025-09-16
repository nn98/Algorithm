def solution(diffs, times, limit):
    history = {}
    answer = 0
    low, high = 0, max(diffs)
    while low < high:
        mid = (low + high) // 2
        if total_solve_time_at(diffs, times, mid, history) <= limit:
            high = mid
        else:
            low = mid + 1
    return low

def total_solve_time_at(diffs, times, now, history):
    total_time = 0
    for idx in range(len(diffs)):
        total_time += solve(diffs, times, now, idx)
    history[now]=total_time
    # print('now: %d / total_time: %d' %(now, total_time))
    return total_time

def solve(diffs, times, level, idx):
    time = 0
    if diffs[idx] > level:
        time = (diffs[idx] - level) * (times[idx] if idx < 1 else times[idx-1] + times[idx])
    time += times[idx]
    # print('solve in idx: %d / time: %d' %(idx, time))
    return time

def solve_prevs(diffs, times, level, idx):
    return sum(times[:idx])

print(solution([1, 5, 3], [2, 4, 7], 30))
print(solution(	[1, 4, 4, 2], [6, 3, 8, 2], 59))
print(solution(		[1, 328, 467, 209, 54], [2, 7, 1, 4, 3], 1723))
print(solution(		[1, 99999, 100000, 99995], [9999, 9001, 9999, 9001], 3456789012))
