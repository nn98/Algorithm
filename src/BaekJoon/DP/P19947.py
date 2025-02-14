import sys
readline = sys.stdin.readline

def main():
    h, y = map(int,readline().split())
    f = y // 5
    y %= 5
    t = y // 3
    y %= 3
    h *= 1.35 * f if f > 0 else 1
    h *= 1.2 * t if t > 0 else 1
    h *= 1.05 * y if y > 0 else 1
    print(int(h))

if __name__ == "__main__":
    main()
