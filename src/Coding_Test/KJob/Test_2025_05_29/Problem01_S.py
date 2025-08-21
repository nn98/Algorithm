import sys

def main():
    readline = sys.stdin.readline
    N, K = map(int, readline().split())
    time = [int(readline()) for _ in range(N)]
    time.sort()

    if N <= 1:
        print(0)
        return

    # 인접한 시간 간격 계산 (불이 꺼져도 되는 시간)
    gaps = []
    for i in range(1, N):
        gaps.append(time[i] - time[i-1] - 1)

    # 전체 시간 범위 (처음부터 끝까지 연속 켤 경우)
    total_span = time[-1] - time[0] + 1

    if K == 1:
        print(total_span)
        return

    # K-1개보다 간격이 적을 경우 모든 시간을 하나로 처리
    if K-1 >= len(gaps):
        print(total_span - sum(gaps))
        return

    # 가장 큰 K-1개 간격 제거
    gaps.sort(reverse=True)
    total = total_span - sum(gaps[:K-1])
    # print('gaps:',gaps,'\n','total_span:',total_span,'\n')
    print(total)

if __name__ == "__main__":
    main()
