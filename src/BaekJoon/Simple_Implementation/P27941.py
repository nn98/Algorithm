a = [[[[[[[[[[[False for a1 in range(2)] for a2 in range(2)] for a3 in range(2)] for a4 in range(2)] for a5 in range(2)]
          for a6 in range(2)] for a7 in range(2)] for a8 in range(2)] for a9 in range(2)] for a10 in range(2)] for a11
     in range(2)]
for _ in range(2047):
    i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11 = map(int, input().split())
    a[i1][i2][i3][i4][i5][i6][i7][i8][i9][i10][i11] = True
for a1 in range(2):
    for a2 in range(2):
        for a3 in range(2):
            for a4 in range(2):
                for a5 in range(2):
                    for a6 in range(2):
                        for a7 in range(2):
                            for a8 in range(2):
                                for a9 in range(2):
                                    for a10 in range(2):
                                        for a11 in range(2):
                                            if not a[a1][a2][a3][a4][a5][a6][a7][a8][a9][a10][a11]:
                                                print(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11)
