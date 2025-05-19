import sys
readline = sys.stdin.readline

def lucky_numbers(n):
    lucky = list(range(1,n+1,2))
    index = 1

    while index < len(lucky):
        now = lucky[index]
        if now > len(lucky):
            break
        lucky = [num for i, num in enumerate(lucky, 1) if i % now != 0]
        index += 1

    return lucky

lucky = set(lucky_numbers(10**6+1))
ans = ''
for i in range(int(readline())):
    ans += ('lucky' if int(readline()) in lucky else 'unlucky') + '\n'
print(ans)