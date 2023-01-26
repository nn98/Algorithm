def golbange_print_ㅂ(N):
    answer = ['' for _ in range(N * 5)]
    for idx in range(N*5):
        if 2 * N - N - 1  < idx < 2 * N or N * 5 - 2 * N - 1 < idx < 5 * N - N:
            answer[idx] = "@" * (N * 5)
        else:
            answer[idx] = f"{'@' * N}{' ' * (N * 5 - N * 2)}{'@' * N}"
    return "\n".join(answer)
if __name__ == "__main__":
    N = int(input())
    print(golbange_print_ㅂ(N=N))