import sys
from heapq import heappush, heappop

readline = sys.stdin.readline

def main():
    n = int(readline())
    arr = list(int(x-1) for x in readline().split())
    print(arr)
    arr = [int(x-1) for x in readline().split()]
    print(arr)

if __name__ == '__main__':
    main()
