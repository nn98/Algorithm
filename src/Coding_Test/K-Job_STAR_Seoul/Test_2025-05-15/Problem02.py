# 정렬 / 단순 구현, 줄세우기 문제
def main():
    x = int(input())
    sol = list(map(int,input().split()))
    sol.sort(reverse = True)
    targets = list(map(int,input().split()))
    for i in range(x):
        print(sol[targets[i]-1],end=' ')

if __name__=="__main__":
    main()