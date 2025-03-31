import sys
import math
from collections import Counter
readline = sys.stdin.readline

N = int(readline())
A = list(map(int, readline().split()))
A.sort()

ans = 0
for val, count in Counter(A).items():
    ans += count / val

print(math.ceil(ans))