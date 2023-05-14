import sys
input = sys.stdin.readline

def sol(board):
    board = board.replace('XXXX', 'AAAA')
    board = board.replace('XX', 'BB')

    if board.count('X') != 0:
        return -1
    else:
        return board

if __name__ == '__main__':
    board = input()

    print(sol(board))
