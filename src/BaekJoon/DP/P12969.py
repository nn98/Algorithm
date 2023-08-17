def bubble():
    for i in range(N - 1):
        if S[i] > S[i + 1]:
            S[i], S[i + 1] = S[i + 1], S[i]
            return
    return True

def ABC():
    for i in range(K):
        if bubble():
            return -1
    return "".join(S)


N, K = map(int, input().split())
S = ["C"] * (N // 3) + ["B"] * ((N - N // 3) // 2) + ["A"] * (N - N // 3 - (N - N // 3) // 2)
print(ABC())
