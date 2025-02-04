import sys
from collections import deque
readline = sys.stdin.readline

def main():
    T = int(readline())
    for i in range(T):
        n, m = map(int,readline().split())
        matrix = [readline().rstrip() for _ in range(n)]
        print(matrix)
        val = [0] * m
        for row in matrix:
            for j in range(m):
                if row[j] == '.':
                    val[j] += 1
        print(val)
        # DP 배열 초기화: 각 열에서 얻을 수 있는 최대 값
        dp = [0] * m
        q = deque()

        # 초기값 설정: 각 열을 시작점으로 설정
        for j in range(m):
            dp[j] = val[j]
            q.append(j)

        # BFS를 이용한 DP 업데이트
        while q:
            idx = q.popleft()

            # 2칸 오른쪽으로 이동
            next_idx = idx + 2
            if next_idx < m:
                # 더 큰 값으로 업데이트 가능한 경우
                if dp[next_idx] < dp[idx] + val[next_idx]:
                    print(dp)
                    dp[next_idx] = dp[idx] + val[next_idx]
                    q.append(next_idx)

            # 3칸 오른쪽으로 이동
            next_idx = idx + 3
            if next_idx < m:
                if dp[next_idx] < dp[idx] + val[next_idx]:
                    print(dp)
                    dp[next_idx] = dp[idx] + val[next_idx]
                    q.append(next_idx)

        # 전체 DP 배열에서 최대값 출력
        print(dp)
        print(max(dp) if m > 0 else 0)

if __name__ == "__main__":
    main()
