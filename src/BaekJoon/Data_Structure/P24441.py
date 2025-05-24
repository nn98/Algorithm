import sys

MAX_N = 1000000
# 행운 수 여부를 저장하는 배열
is_lucky = [False] * (MAX_N + 1)

# 1부터 1,000,000까지 홀수만 리스트에 저장
numbers = list(range(1, MAX_N + 1, 2))

idx = 1  # 첫 번째는 1, 두 번째는 3이므로, 두 번째부터 시작
while idx < len(numbers):
    k = numbers[idx]
    if k > len(numbers):
        break
    # k번째마다(1-based) 지우기
    del numbers[k-1::k]
    idx += 1

# 행운 수 기록
for num in numbers:
    if num <= MAX_N:
        is_lucky[num] = True

# 입력 및 출력 처리
input = sys.stdin.readline
T = int(input())
answers = []
for _ in range(T):
    n = int(input())
    answers.append("lucky" if is_lucky[n] else "unlucky")

print('\n'.join(answers))
