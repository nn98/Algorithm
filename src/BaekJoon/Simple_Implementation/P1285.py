n = int(input())
coin = [list(input()) for _ in range(n)]
res = n * n + 1

for bit in range(1 << n):
    #리스트복사
    tmp = [coin[i][:] for i in range(n)]
    for i in range(n):
    	#비트마스킹 만족하면 해당 행 뒤집기
        if bit & (1 << i):
            for j in range(n):
                if tmp[i][j] == 'H':
                    tmp[i][j] = 'T'
                else:
                    tmp[i][j] = 'H'

    tsum = 0
    for i in range(n):
        cnt = 0
        for j in range(n):
            if tmp[j][i] == 'T':
                cnt += 1
        #T가 더 많을 경우 뒤집기
        tsum += min(cnt, n-cnt)
    res = min(res, tsum)
