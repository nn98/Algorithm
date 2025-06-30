import sys
readline = sys.stdin.readline

def main():
    n = int(readline())
    arr = list(map(int,readline().split()))
    m_size = 50
    prime = [True] * m_size
    prime[0] = prime[1] = False
    for idx in range(m_size):
        if prime[idx]:
            for idx_next in range(idx*2, m_size, idx):
                prime[idx_next] = False
    print(prime)
    his = [False] * n
    his[0] = True
    sum_val(0,arr,his,prime)

def sum_val(idx, arr, his, prime):
    print(his, idx)
    for idx_next in range(len(arr)):
        if not his[idx_next]:
            if prime[arr[idx] + arr[idx_next]]:
                his[idx_next] = True
                print(arr[idx], arr[idx_next])
                if False not in his:
                    print('success!')
                for idx_new in range(len(arr)):
                    sum_val(idx_new, arr, his, prime)
                his[idx_next] = False

if __name__ == "__main__":
    main()
