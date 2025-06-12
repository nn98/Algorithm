import sys
# from collections import deque
readline = sys.stdin.readline

def main():
    n = int(readline())
    m = int(readline())
    parts = {i:[] for i in range(n)}

    for _ in range(m):
        x, y, k = map(int,readline().split())
        parts[x-1].append((y-1, k))

    for i in range(n):
        if not parts[i]:
            parts[i] = [(i, 1)]
    # print(parts)

    ans = {}
    q = [n-1]
    while q:
        num = q.pop()
        # print('num:',num,'len(parts[num]):',len(parts[num]),'parts[num][0]:',parts[num][0])
        for number, count in parts[num]:
            if parts[number][0][0] == number:
                if number not in ans: ans[number] = 0
                ans[number] += count
            else:
                q.extend([number]*count)

    for number, count in sorted(ans.items()):
        print(number+1, count)

if __name__ == "__main__":
    main()
