import sys
readline = sys.stdin.readline

while True:
    line = readline().rstrip()
    if line == "0": break;
    arr = list(map(int, line.split()))
    n = arr.pop(0)
    max_value = 0
    stack = []
    for i in range(n):
        while stack and arr[i] < arr[stack[-1]]:
            # 높이[값의 인덱스]
            from_index = stack.pop()
            # 너비( == 인덱스)
            to_index = i

            # 스택에 값이 남아 있으면 그 다음값(인덱스) + 1 만큼 빼기
            if stack: to_index -= stack[-1] + 1

            value = arr[from_index] * to_index
            max_value = max(max_value, value)
        stack.append(i)

    while stack:
        from_index = stack.pop()
        to_index = n

        if stack: to_index -= stack[-1] + 1
        value = arr[from_index] * to_index
        max_value = max(max_value, value)

    print(max_value)
