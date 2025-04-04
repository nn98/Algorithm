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
