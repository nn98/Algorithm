import sys
# from collections import deque
readline = sys.stdin.readline

def main():
    n = int(readline())
    m = int(readline())
    # parts = [[] for _ in range(n)]
    parts = {}
    for _ in ragne(m):
        x, y, k = map(int,readline().split())
        parts[x-1] = (y-1, k)

    needs = [[] for _ in range(n)]
    st = [n-1]

    for i in range(n):
        if not parts[i]:
            parts[i] = (i, 1)

    print(parts)

    # while st:
    #     num = st.pop()
    #     if not parts[num]:
    #         needs[num].append((num, 1))
    #     else:
    #         for part in parts[num]:
    #             st.


if __name__ == "main":
    main()
