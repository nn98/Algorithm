import sys
import numpy as np
readline = sys.stdin.readline

def main():
    n, m = map(int,readline().split())
    lamp = [list(map(int,readline().split())) for _ in range(n)]
    k = int(readline())
    print(lamp)
    arr = np.array(lamp)
    col_sums = arr.sum(axis=0)
    print(col_sums)

# def get_offed(col, lamp):
#     result = 0
#     for i in range(len(lamp)):


if __name__ == "__main__":
    main()
