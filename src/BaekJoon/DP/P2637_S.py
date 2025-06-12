import sys
from collections import defaultdict, deque

def main():
    readline = sys.stdin.readline
    n = int(readline())
    m = int(readline())

    # parts: 각 부품이 어떤 하위 부품들로 구성되는지 저장
    parts = [[] for _ in range(n)]
    for _ in range(m):
        x, y, k = map(int, readline().split())
        parts[x-1].append((y-1, k))

    # 기본 부품(리프 노드) 확인
    is_basic = [False] * n
    for i in range(n):
        if not parts[i]:
            is_basic[i] = True
            parts[i] = [(i, 1)]  # 자기 자신을 필요로 함
    # print(parts)

    # 필요한 기본 부품 수량 계산
    required = defaultdict(int)
    q = deque()
    q.append((n-1, 1))  # (부품 번호, 필요한 수량)

    while q:
        current, cnt = q.popleft()
        for part, num in parts[current]:
            if is_basic[part]:
                required[part] += cnt * num
            else:
                q.append((part, cnt * num))
    # print(required)

    # 결과 출력 (부품 번호 순으로 정렬)
    for part in sorted(required):
        print(part + 1, required[part])

if __name__ == "__main__":
    main()
