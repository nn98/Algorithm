import sys
readline = sys.stdin.readline

def histogram(hights):
    stack = []
    max_area = 0
    hights.append(0)


def main():
    r, c = map(int,readline().split())
    height = [0] * (c+1)
    max_area = 0

    for _ in range(r):
        row = list(map(int,readline().split()))
        for j in range(c):
            height[j+1] = height[j+1] + 1 if row[j] == 0 else 0
        print(height)
        current_max = histogram(height[1:])
        print(current_max)
        max_area = max(max_area, current_max)

    print(max_area)

if __name__ == '__main__':
    main()
