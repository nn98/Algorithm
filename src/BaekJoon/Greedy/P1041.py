import sys

readline = sys.stdin.readline

N = int(readline())
dice = list(map(int, readline().split()))
case_1 = min(dice)
case_2 = min([dice[0] + dice[1], dice[0] + dice[2], dice[0] + dice[3], dice[0] + dice[4],
              dice[5] + dice[1], dice[5] + dice[2], dice[5] + dice[3], dice[5] + dice[4],
              dice[1] + dice[2], dice[1] + dice[3], dice[2] + dice[4], dice[3] + dice[4]])
case_3 = min([dice[0] + dice[1] + dice[2],
              dice[0] + dice[1] + dice[3],
              dice[0] + dice[2] + dice[4],
              dice[0] + dice[3] + dice[4],
              dice[5] + dice[1] + dice[2],
              dice[5] + dice[1] + dice[3],
              dice[5] + dice[2] + dice[4],
              dice[5] + dice[3] + dice[4]])
print(case_1, case_2, case_3)

if N == 1:
    print(sum(dice) - max(dice))
else:
    ans = case_3 * 4
    print(case_3 * 4)
    ans += case_2 * 4 * (2 * N - 3)
    print(case_2 * 4 * (2 * N - 4))
    ans += case_1 * ((N - 2) * (N - 2) + (N - 2) * (N - 1) * 4)
    print(case_1 * ((N - 2) * (N - 2) + (N - 2) * (N - 1) * 4))
    print('\t', ans)
