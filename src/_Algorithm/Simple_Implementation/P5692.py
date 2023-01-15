import sys
fac=[1]
for i in range(1,10):
    fac.append(i*fac[i-1])
# print(fac)
while True:
    numbers=sys.stdin.readline()
    if numbers == '0':
        break;
    result=0
    for index in range(len(numbers)):
        result+=fac[len(numbers)-index]*int(numbers[index])
    print(result)