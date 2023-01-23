import sys
lst = []
n = int(sys.stdin.readline().rstrip())
for i in range(1, n+1):
    h = int(sys.stdin.readline().rstrip())
    a = sys.stdin.readline().rstrip()
    for j in a:
        if h == 0:
            break
        if j == 'b':
            h -= 1
        elif j == 'c':
            h += 1
    lst.append(h)
for k in range(len(lst)):
    print("Data Set %d:" %  int(k+1))
    print(lst[k])
    print("\n", end="")