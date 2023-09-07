from collections import defaultdict

N = int(input())
words = [input().strip() for _ in range(N)]
cache = defaultdict(lambda: defaultdict(int))

def getcharnum(s, idx):
    if s[idx] == 'A': return 0
    elif s[idx] == 'E': return 1
    elif s[idx] == 'I': return 2
    elif s[idx] == 'O': return 3
    elif s[idx] == 'U': return 4
    else: return -1

def solve(lastword, cur):
    if cur == (1 << N) - 1:
        return 0
    
    lastchar = getcharnum(words[lastword], len(words[lastword]) - 1)
    if cache[lastchar][cur] != 0:
        return cache[lastchar][cur]
    
    ret = 0
    for i in range(N):
        if cur & (1 << i): continue
        if lastchar != getcharnum(words[i], 0): continue
        ret = max(ret, solve(i, cur | (1 << i)) + len(words[i]))
    
    cache[lastchar][cur] = ret
    return ret

ans = 0
for i in range(N):
    cache.clear()
    ans = max(ans, solve(i, 1 << i) + len(words[i]))

print(ans)
