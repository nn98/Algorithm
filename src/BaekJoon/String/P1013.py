import sys
import re
readline = sys.stdin.readline

def main():
    T = int(readline())
    for _ in range(T):
        line = readline().strip()
        pattern = re.compile('(100+1+|01)+')
        match = pattern.fullmatch(line)
        print('YES' if match else 'NO')

if __name__ == "__main__":
    main()
