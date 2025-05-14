import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    a = list(map(int, sys.stdin.readline().split()))

    groups = [[0, 0] for _ in range(k)]  # [count0, count1] for each group

    for idx in range(n):
        parity = a[idx] % 2
        group = idx % k
        groups[group][parity] += 1

    print(groups)
    base = 0
    delta = []
    for cnt0, cnt1 in groups:
        cost0 = cnt1
        cost1_val = cnt0
        base += cost0
        delta.append(cost1_val - cost0)

    delta_sorted = sorted(delta)
    selected = []
    sum_selected = 0
    for d in delta_sorted:
        if d < 0:
            selected.append(d)
            sum_selected += d
        else:
            break  # 남은 요소는 0 이상

    m = len(selected)
    if m % 2 == 0:
        total = base + sum_selected
    else:
        # delta_remove: 가장 작은 음수 제거 (절댓값이 가장 작음)
        delta_remove_val = selected[-1] if m > 0 else 0
        delta_remove_abs = -delta_remove_val

        # delta_add: 가장 작은 양수 추가
        delta_add_val = delta_sorted[m] if m < len(delta_sorted) else float('inf')

        if delta_remove_abs <= delta_add_val:
            total = base + (sum_selected - delta_remove_val)
        else:
            total = base + (sum_selected + delta_add_val)

    print(total)

if __name__ == "__main__":
    main()
