import sys
import numpy as np
readline = sys.stdin.readline

def main():
    n, m = map(int,readline().split())
    lamp = [readline() for _ in range(n)]
    k = int(readline())
    arr = np.array(lamp)
    print(arr)

# def get_offed(col, lamp):
#     result = 0
#     for i in range(len(lamp)):


if __name__ == "__main__":
    main()
