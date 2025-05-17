# 문자열 / 단순 구현, 열쇠 자물쇠 문제
def main():
    x = int(input())
    key = input()
    lock = input()
    isUnlock = True
    for i in range(x):
        isUnlock = key[i] != lock[i]
        if not isUnlock: break;
    print('YES' if isUnlock else 'NO')

if __name__=="__main__":
    main()