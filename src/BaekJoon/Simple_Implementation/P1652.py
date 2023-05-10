n = int(input())
room = []
for _ in range(n):
    room.append(list(map(str, input())))
    
res = [0, 0]
for i in range(n):
    cnt_h, cnt_v = 0, 0
    for j in range(n):
        if room[i][j] == '.':
            cnt_h += 1
        elif room[i][j] == 'X':
            if cnt_h >= 2:
                res[0] += 1
            cnt_h = 0
            
        if room[j][i] == '.':
            cnt_v += 1
        elif room[j][i] == 'X':
            if cnt_v >= 2:
                res[1] += 1
            cnt_v = 0
            
            
        if j == n-1:
            if cnt_h >= 2:
                res[0] += 1
            if cnt_v >= 2:
                res[1] += 1
            
print(' '.join(map(str, res)))
