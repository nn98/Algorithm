import sys

readline = sys.stdin.readline

def histogram(heights):
    stack = []
    max_area = 0
    max_height = 0
    max_width = 0
    heights.append(0)

    for i in range(len(heights)):
        # 조건검사할때 앞조건 False면 뒤 스킵
        while stack and heights[i] < heights[stack[-1]]:
            # 스택이 차 있어야 [-1] 가능하니 스택이 앞 조건
            # heights[i] 가 작다는건 중간에 돌멩이를 만나서 끊긴 부분이나 제일 마지막이란뜻
            # heights[stack[-1]], 스택의 최상단에 있는 인덱스의 값이
            # heights[i]보다 작지 않다는건 돌멩이를 만나서 끊긴 부분이라는뜻 - 종료
            print('heights:',heights,'stack:',stack)
            h = heights[stack.pop()]
            w = i if not stack else i - (stack[-1] + 1)
            # 스택이 비었으면 열의 현재 최대 길이인 i
            # 아직 값이 있으면(돌멩이 만나기 전까지) 최대길이 i 에서 현재길이(스택 다음값+1)만큼 빼기
            print('i:',i,'not stack:',not stack)
            print('h:',h,'w:',w)
            this_area = w * h
            if this_area > max_area:
                max_area = this_area
                max_height = h
                max_width = i - w + 1

        stack.append(i)
    return max_area, max_height, max_width


def main():
    r, c = map(int,readline().split())
    height = [0] * (c+1)
    max_area = 0
    max_height = 0
    max_width = 0

    for i in range(r):
        row = list(map(int,readline().split()))
        for j in range(c):
            height[j+1] = height[j+1] + 1 if row[j] == 0 else 0
        print('height: ',height)
        current_max = histogram(height[1:])
        print('current_max', current_max)
        this_area, this_height, this_width = current_max
        if this_area > max_area:
            max_area = this_area
            max_height = i - this_height + 2
            max_width = this_width

    print(f"{max_area}\n{max_height} {max_width}")

if __name__ == '__main__':
    main()
