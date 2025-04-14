import sys

def GCD(a, b):
    return a if b == 0 else GCD(b, a % b)

def main():
    input = sys.stdin.readline
    for _ in range(int(input())):
        data = input().split()
        sum = 0
        for i in range(1, int(data[0])):
            for j in range(i+1, int(data[0])+1):
                sum += GCD(int(data[i]), int(data[j]))
        print(sum)

if __name__ == "__main__":
    main()
