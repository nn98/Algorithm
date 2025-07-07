import sys
import threading

def main():
    import sys
    sys.setrecursionlimit(10000)
    n = int(sys.stdin.readline())
    arr = list(map(int, sys.stdin.readline().split()))

    # 소수 판별
    MAX = 2001
    is_prime = [True] * MAX
    is_prime[0] = is_prime[1] = False
    for i in range(2, int(MAX ** 0.5) + 1):
        if is_prime[i]:
            for j in range(i * i, MAX, i):
                is_prime[j] = False

    # 첫 번째 수와 짝지을 수 있는 후보
    answer = []
    for i in range(1, n):
        if is_prime[arr[0] + arr[i]]:
            used = [False] * n
            used[0] = used[i] = True
            pairs = []

            def can_match():
                # 남은 수들로 완전 매칭 가능한지 백트래킹
                def dfs(path):
                    if len(path) == n:
                        return True
                    # 다음 짝짓기 시작점 찾기
                    for a in range(1, n):
                        if not used[a]:
                            break
                    else:
                        return True  # 모두 사용됨
                    used[a] = True
                    for b in range(a + 1, n):
                        if not used[b] and is_prime[arr[a] + arr[b]]:
                            used[b] = True
                            if dfs(path + [(a, b)]):
                                used[b] = False
                                used[a] = False
                                return True
                            used[b] = False
                    used[a] = False
                    return False

                return dfs([])

            if can_match():
                answer.append(arr[i])

    if answer:
        print(' '.join(map(str, sorted(answer))))
    else:
        print(-1)

if __name__ == "__main__":
    threading.Thread(target=main).start()
