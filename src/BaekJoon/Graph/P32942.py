A, B, C = map(int, input().split())

graph = [[] for _ in range(11)]

for x in range(1, 11):
    if B != 0:
        # By = C - Ax에서 y = (C - Ax) / B
        if (C - A * x) % B == 0:  # 나누어 떨어지는지 확인
            y = (C - A * x) // B
            if 1 <= y <= 10:  # y가 범위 내에 있는지 확인
                graph[x].append(y)
    else:  # B == 0인 경우
        if A * x == C:  # Ax = C를 만족하는 경우
            # 모든 y 값이 가능
            for y in range(1, 11):
                graph[x].append(y)

# 출력
for i in range(1, 11):
    if graph[i]:
        graph[i].sort()
        print(*graph[i])
    else:
        print(0)
