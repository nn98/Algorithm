import sys
from math import ceil
input = sys.stdin.readline

INF = 10**18

class SegTree:
    def __init__(self, n):
        self.n = n
        self.size = 1
        while self.size < n:
            self.size <<= 1
        self.t = [INF] * (2 * self.size)
    def build_from(self, arr):
        for i, v in enumerate(arr):
            self.t[self.size + i] = v
        for i in range(self.size - 1, 0, -1):
            self.t[i] = min(self.t[i << 1], self.t[i << 1 | 1])
    def point_set(self, idx, val):
        i = self.size + idx
        self.t[i] = val
        i >>= 1
        while i:
            self.t[i] = min(self.t[i << 1], self.t[i << 1 | 1])
            i >>= 1
    def min_all(self):
        return self.t[1]
    # find first index with value <= cap; return -1 if none
    def first_leq(self, cap):
        if self.t[1] > cap:
            return -1
        v, tl, tr = 1, 0, self.size - 1
        while tl != tr:
            mid = (tl + tr) >> 1
            left = v << 1
            if self.t[left] <= cap:
                v = left
                tr = mid
            else:
                v = left | 1
                tl = mid + 1
        return tl if tl < self.n else -1

def solve():
    n, p, k = map(int, input().split())
    groups = [tuple(map(int, input().split())) for _ in range(n)]
    groups.sort()  # (time, size)

    times = [g[0] for g in groups]
    sizes = [g[1] for g in groups]

    st = SegTree(n)
    st.build_from([INF] * n)  # 아직 도착 안 함

    boarded = 0
    arrive_ptr = 0
    result = 0
    dep = 0

    # 초기 출발을 첫 도착에 맞춰 점프(빈 운행 스킵)
    if arrive_ptr < n and dep < times[arrive_ptr]:
        dep = ((times[arrive_ptr] + p - 1) // p) * p

    while boarded < n:
        # dep 시각까지 도착한 그룹 활성화
        while arrive_ptr < n and times[arrive_ptr] <= dep:
            st.point_set(arrive_ptr, sizes[arrive_ptr])
            arrive_ptr += 1

        cap = k
        # 이번 출발에서 태울 수 있을 때까지 반복
        while cap > 0:
            idx = st.first_leq(cap)
            if idx == -1:
                break
            result += dep - times[idx]
            cap -= sizes[idx]
            st.point_set(idx, INF)  # 탑승 처리
            boarded += 1

        # 다음 출발로
        dep += p

        # 대기열이 비었고 다음 도착이 dep 이후면 dep를 점프
        if st.min_all() == INF and arrive_ptr < n and dep < times[arrive_ptr]:
            dep = ((times[arrive_ptr] + p - 1) // p) * p

    print(result)

if __name__ == "__main__":
    solve()
