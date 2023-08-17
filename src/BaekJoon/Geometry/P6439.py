def ccw(p1, p2, p3):
    return p1[0] * p2[1] + p2[0] * p3[1] + p3[0] * p1[1] - (p1[0] * p3[1] + p3[0] * p2[1] + p2[0] * p1[1])

def func(p1, p2, p3, p4):
    ccw1 = ccw(p1, p2, p3)
    ccw2 = ccw(p1, p2, p4)
    ccw3 = ccw(p3, p4, p1)
    ccw4 = ccw(p3, p4, p2)

    if ccw1 == 0 and ccw2 == 0 and ccw3 == 0 and ccw4 == 0:
        if (min(p1[0], p2[0]) > max(p3[0], p4[0]) or
            min(p1[1], p2[1]) > max(p3[1], p4[1]) or
            min(p3[0], p4[0]) > max(p1[0], p2[0]) or
            min(p3[1], p4[1]) > max(p1[1], p2[1])):
            return False
    if ccw1 * ccw2 <= 0 and ccw3 * ccw4 <= 0:
        return True
    return False

tc = int(input())
for _ in range(tc):
    ix1, iy1, ix2, iy2, a, b, c, d = map(int, input().split())
    i1 = (ix1, iy1)
    i2 = (ix2, iy2)
    minx = min(a, c)
    miny = min(b, d)
    maxx = max(a, c)
    maxy = max(b, d)
    minix = min(ix1, ix2)
    miniy = min(iy1, iy2)
    maxix = max(ix1, ix2)
    maxiy = max(iy1, iy2)
    
    if func((a, b), (a, d), i1, i2) or \
       func((a, b), (c, b), i1, i2) or \
       func((c, d), (c, b), i1, i2) or \
       func((a, d), (c, d), i1, i2) or \
       (minx <= minix and maxix <= maxx and miny <= miniy and miniy <= maxy):
        print("T")
    else:
        print("F")
