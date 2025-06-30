import math
import itertools

T = int(input().strip())
results = []

for _ in range(T):
    N = int(input().strip())
    points = []
    total_x, total_y = 0, 0

    # 점 입력 및 전체 합 계산
    for _ in range(N):
        x, y = map(int, input().split())
        points.append((x, y))
        total_x += x
        total_y += y

    min_length = float('inf')
    half = N // 2

    # 모든 조합 탐색
    for comb in itertools.combinations(points, half):
        sum_sx, sum_sy = 0, 0
        for (x, y) in comb:
            sum_sx += x
            sum_sy += y

        # 벡터 합 계산: (T - 2S)
        vec_x = total_x - 2 * sum_sx
        vec_y = total_y - 2 * sum_sy
        length = math.sqrt(vec_x**2 + vec_y**2)

        if length < min_length:
            min_length = length

    results.append(min_length)

# 결과 출력
for res in results:
    print(res)
