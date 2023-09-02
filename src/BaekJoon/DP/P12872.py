n, m, p = map(int, input().split())
d = [[-1] * (n+1) for _ in range(p+1)]

def cal(len, pick):
    sur = n - pick
    
    if len == p:
        if sur == 0:
            return 1
        else:
            return 0
    
    if d[len][pick] != -1:
        return d[len][pick]
    
    d[len][pick] = 0
    
    if sur > 0:
        d[len][pick] += cal(len+1, pick+1) * sur
    
    if pick > m:
        d[len][pick] += cal(len+1, pick) * (pick - m)
    
    d[len][pick] %= 1000000007
    
    return d[len][pick]

print(cal(0, 0))
