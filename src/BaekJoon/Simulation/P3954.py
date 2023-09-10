import sys

input = sys.stdin.readline


def move(c):
    global pointer, sm, data_idx, si, code_idx, sc, max_code_idx
    if c == "-":
        arr[pointer] -= 1
        arr[pointer] %= 256
    elif c == "+":
        arr[pointer] += 1
        arr[pointer] %= 256
    elif c == "<":
        pointer -= 1
        pointer %= sm  # 데이터 배열의 범위를 넘어가면 반대쪽으로 이동
    elif c == ">":
        pointer += 1
        pointer %= sm  # 데이터 배열의 범위를 넘어가면 반대쪽으로 이동
    elif c == "[":
        if arr[pointer] == 0:
            code_idx = teleport[code_idx]
    elif c == "]":
        if arr[pointer] != 0:
            code_idx = teleport[code_idx]
    elif c == ".":
        pass  # 포인터 출력은 무시
    elif c == ",":
        if data_idx < si:
            arr[pointer] = ord(data[data_idx])  # 문자 하나를 읽고 포인터가 가리키는 곳에 저장
            data_idx += 1
        else:
            arr[pointer] = 255  # 입력의 마지막인 부분이면 255 저장


def Loops_check():
    global code_idx, sc, max_code_idx
    cnt = 0  # 명령어 횟수
    while code_idx < sc:
        cnt += 1
        move(code[code_idx])  # 이동
        if cnt >= 50000000: # 한 번의 무한 루프에서 실행되는 명령어 개수는 50000000개 이하
            max_code_idx = min(max_code_idx, code_idx)
        code_idx += 1
        if cnt >= 2*50000000: #'[', ']' 가 반복적으로  50,000,000이상 수행한 경우 무한루프
            print("Loops", max_code_idx, teleport[max_code_idx])
            return
    print("Terminates")
    return


def find_loop(code):
    teleport = {}
    save = []
    for idx, c in enumerate(code):
        if c == "[":
            save.append(idx)
        elif c == "]":
            to = save.pop()
            teleport[idx] = to
            teleport[to] = idx
    return teleport


if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        sm, sc, si = map(int, input().split())  # 메모리(배열)의 크기, 프로그램 코드의 크기, 입력의 크기
        code = input().rstrip()  # Brainf**k 프로그램
        data = input().rstrip()  # 프로그램의 입력(공백이 아니면서 출력할 수 있는 문자)
        arr = [0] * sm  # 초기 대이터 배열의 값은 0으로 초기화
        pointer = 0  # 포이터가 가리키는 칸은 0번 칸
        code_idx = 0  # 코드 부분 인덱스
        data_idx = 0  # 데이터부분 인덱스
        teleport = find_loop(code)  # 순간이동 부분 기록
        max_code_idx = sc
        Loops_check()
