import sys
input = sys.stdin.readline

numberPicture = [
    ["###", "#.#", "#.#", "#.#", "###"], # 0
    ["..#", "..#", "..#", "..#", "..#"], # 1
    ["###", "..#", "###", "#..", "###"], # 2
    ["###", "..#", "###", "..#", "###"], # 3
    ["#.#", "#.#", "###", "..#", "..#"], # 4
    ["###", "#..", "###", "..#", "###"], # 5
    ["###", "#..", "###", "#.#", "###"], # 6
    ["###", "..#", "..#", "..#", "..#"], # 7
    ["###", "#.#", "###", "#.#", "###"], # 8
    ["###", "#.#", "###", "..#", "###"]  # 9
]


N = int(input())
numberBoard = [input().rstrip() for _ in range(5)]
floor = [[False]*10 for _ in range(N)] # N층에 올 수 있는 번호 경우의 수

for k in range(N):
    arr = []
    for i in range(5):
        arr.append(numberBoard[i][k*4 : k*4+3])

    for num in range(10):
        isPossible = True
        for i in range(5):
            for j in range(3):
                if numberPicture[num][i][j] != arr[i][j] and arr[i][j] == "#":
                    isPossible = False
                    break
            if isPossible == False:
                break

        if isPossible == True:
            floor[k][num] = True

flag = True
for i in range(N):
    for j in floor[i]:
        if j == True:
            break
    else:
        flag = False
        break

def calculate():
    cnt = 1 # 전체 경우수
    cnt_arr = [0] * N
    for i in range(N):
        c = 0
        for j in floor[i]:
            if j == True:
                c += 1
        cnt_arr[i] = c
        cnt *= c

    value = 0
    for i in range(N):
        # N-i 자릿수
        i_cnt = cnt // cnt_arr[i] # N=i 자릿수의 값이 등장하는 횟수
        for j in range(10):
            if floor[i][j] == True:
                value += j * 10**(N-i-1) * i_cnt

    return value / cnt

if flag == True:
    ans = calculate()
else:
    ans = -1

print(ans)
