A = int(input())
HA = 0  # higher A
LA = 0  # lower A
oneCnt = 0  # bit masking 전 까지 1의 개수
one = 1
mask = 3  # 1(2), 11(2)

def get_nearest_lower():
    global LA
    LA = A ^ mask  # 10 -> 01
    LA = (LA // one) * one  # 이하 버리기
    n = (one >> 1)  # 왼쪽부터 1 채우기
    cnt = oneCnt
    while n and cnt:
        LA += n
        n >>= 1
        cnt -= 1

def get_nearest_higher():
    global HA
    HA = A ^ mask  # 01 -> 10
    HA = (HA // one) * one  # 이하 버리기
    n = 1  # 오른쪽부터 1 채우기
    cnt = oneCnt
    while n < one and cnt:
        HA += n
        n <<= 1
        cnt -= 1

while True:
    if LA and HA:
        break
    if one > A:
        break

    if (A & mask) == (one << 1):
        get_nearest_lower()
    if (A & mask) == one:
        get_nearest_higher()
    if A & one:
        oneCnt += 1

    one <<= 1
    mask <<= 1

print(LA, HA)
