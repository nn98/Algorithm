import sys
from collections import deque

def main():
    # 3줄 입력을 한 문자열로 합치기 (예: '123456780')
    start = ''.join(''.join(sys.stdin.readline().split()) for _ in range(3))
    end = '123456780'

    if start == end:  # 초기 상태 검사
        print(0)
        return

    # 이동 가능 위치 사전 계산
    move_table = {
        0: [1,3], 1: [0,2,4], 2: [1,5],
        3: [0,4,6], 4: [1,3,5,7], 5: [2,4,8],
        6: [3,7], 7: [4,6,8], 8: [5,7]
    }

    visited = set()
    q = deque([(start, 0)])
    visited.add(start)

    while q:
        state, count = q.popleft()

        # 다음 상태 생성
        idx = state.index('0')
        for move in move_table[idx]:
            new_state = list(state)
            new_state[idx], new_state[move] = new_state[move], new_state[idx]
            new_state = ''.join(new_state)

            if new_state == end:
                print(count + 1)
                return

            if new_state not in visited:
                visited.add(new_state)
                q.append((new_state, count + 1))

    print(-1)

if __name__ == '__main__':
    main()
