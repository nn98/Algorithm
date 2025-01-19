import sys
readline = sys.stdin.readline

def main():
    n = int(readline())
    dp_min = [0]*3
    dp_max = [0]*3
    for i in range(n):
        v1, v2, v3 = map(int,readline().split())
        if i == 0:
            dp_max[0] = dp_min[0] = v1
            dp_max[1] = dp_min[1] = v2
            dp_max[2] = dp_min[2] = v3
        else:
            dp_max[0], dp_max[1], dp_max[2] = max(dp_max[:2]) + v1, max(dp_max) + v2, max(dp_max[1:3]) + v3
            dp_min[0], dp_min[1], dp_min[2] = min(dp_min[:2]) + v1, min(dp_min) + v2, min(dp_min[1:3]) + v3
    print(max(dp_max), min(dp_min))
if __name__ == "__main__":
    main()
