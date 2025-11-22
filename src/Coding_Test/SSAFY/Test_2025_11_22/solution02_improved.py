import math
from collections import Counter

T = int(input())
for tc in range(1, T + 1):
    N = int(input())
    target = input().strip()
    K = int(input())

    freq = Counter(target)          # 각 문자 개수
    # t의 상한은 최악의 경우 전체 길이 N
    left, right = 1, N
    answer = N

    while left <= right:
        mid = (left + right) // 2   # mid = 후보 t
        need = 0
        for c in freq.values():
            need += math.ceil(c / mid)
        if need <= K:
            # mid 개의 K-길이 문자열로 target 만들 수 있음 -> 더 줄여본다
            answer = mid
            right = mid - 1
        else:
            # mid 개로는 부족하니 t를 늘려야 한다
            left = mid + 1

    print(f"#{tc} {answer}")
