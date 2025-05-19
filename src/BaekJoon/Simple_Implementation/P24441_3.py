import sys
from array import array

def lucky_numbers(max_n):
    current = array('I', range(1, max_n + 1, 2))
    index = 1
    while index < len(current):
        print(index)
        k = current[index]
        if k > len(current):
            break
        new_current = array('I')
        count = 0
        for num in current:
            count += 1
            if count % k != 0:
                new_current.append(num)
        current = new_current
        index += 1
    return set(current)

input = sys.stdin.read
data = input().split()
T = int(data[0])
queries = list(map(int, data[1:T+1]))
max_query = max(queries)
lucky = lucky_numbers(max_query)
result = []
for n in queries:
    result.append('lucky' if n in lucky else 'unlucky')
print('\n'.join(result))
