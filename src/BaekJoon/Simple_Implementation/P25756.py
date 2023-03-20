def calculate_defend_ignore_rate(N, potion_list):
    answer_list = []

    defend_ignore_rate = 1

    for potion in potion_list:
        defend_ignore_rate *= (1 - potion / 100)

        calculated_rate = (1 - defend_ignore_rate) * 100

        answer_list.append(round(calculated_rate, 6))

    return answer_list


def print_answer(answer):
    for ans in answer:
        print(ans)


if __name__ == "__main__":
    N = int(input())
    potion_list = list(map(int, input().split()))

    answer = calculate_defend_ignore_rate(N=N, potion_list=potion_list)

    print_answer(answer=answer)
