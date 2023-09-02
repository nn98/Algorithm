import sys

# tc : 테스트케이스의 수
tc = int(sys.stdin.readline())
for _ in range(tc):
    # 입력부
    n = int(sys.stdin.readline())
    # cache : 입력으로 주어지는 점들의 집합
    cache = set()
    arr = []
    ans = 0
    for _ in range(n):
        a, b = map(int, sys.stdin.readline().split())
        cache.add((a, b))
        arr.append((a, b))
        
    # 두 점을 뽑는다
    for i in range(n):
        for j in range(n):
            # 같은 점이라면 continue
            if i == j:
                continue
            x1, y1 = arr[i]
            x2, y2 = arr[j]
            # 현재 최대 넓이보다 작거나 같으면 continue
            if ans >= (x1 - x2) ** 2 + (y1 - y2) ** 2:
                continue
            x_diff, y_diff = x1 - x2, y1 - y2
            # 두 점이 cache에 있는지 없는지 판단
            if (x1 - y_diff, y1 + x_diff) in cache and (x2 - y_diff, y2 + x_diff) in cache:
                ans = max(ans, (x1 - x2) ** 2 + (y1 - y2) ** 2)
    # 정답 출력
    print(ans)
