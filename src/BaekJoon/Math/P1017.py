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
    sum_val(0,arr,his,arr[0],prime)

def sum_val(idx, arr, his, val, prime):
    print(his, val)
    for idx_next in range(len(arr)):
        if not his[idx_next]:
            his[idx_next] = True
            sum_val(idx_next, arr, his, val+arr[idx_next], prime)

if __name__ == "__main__":
    main()
