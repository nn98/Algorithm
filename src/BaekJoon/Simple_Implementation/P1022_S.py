import sys

def get_value(x, y):
    k = max(abs(x), abs(y))
    if k == 0:
        return 1
    start = (2 * k - 1) ** 2 + 1
    if y == -k:
        # Bottom side
        offset = (k - 1 - x)
        return start + 2 * k + offset
    elif x == -k:
        # Left side
        offset = (y - (-k + 1))
        return start + 4 * k + offset
    elif y == k:
        # Top side
        offset = (x - (-k + 1))
        return start + 6 * k + offset
    else:
        # Right side (x == k)
        offset = (k - 1 - y)
        return start + offset

def main():
    r1, c1, r2, c2 = map(int, sys.stdin.readline().split())
    p_matrix = []
    max_val = -1
    for y in range(r1, r2 + 1):
        row = []
        for x in range(c1, c2 + 1):
            val = get_value(x, y)
            row.append(val)
            if val > max_val:
                max_val = val
        p_matrix.append(row)

    m_digit = len(str(max_val))

    for row in p_matrix:
        formatted_row = ' '.join(str(val).rjust(m_digit) for val in row)
        print(formatted_row)

if __name__ == "__main__":
    main()
