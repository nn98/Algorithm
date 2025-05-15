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