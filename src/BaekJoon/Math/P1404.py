import sys
input = sys.stdin.readline
# w_r_l : 승리 확률 리스트
w_r_l = [[] for i in range(8)]
w_r = list(map(int, input().split()))
j = -1
j_l = [0, 7, 13, 18, 22, 25, 27]
for i, v in enumerate(w_r):
#     print("i :", i, ", v :", v)
    if i in j_l:
        j += 1
        w_r_l[j].append(0)

    w_r_l[j].append(v / 100)
    w_r_l[len(w_r_l[j]) - 1].append((100 - v) / 100)
j += 1
w_r_l[j].append(0)
# for i in w_r_l:
#     print(i)

# o_w : 각 선수가 1라운드에서 이길 확률
o_w = []
for i in range(8):
    if i % 2 == 0:
        op = i + 1
    else:
        op = i - 1
    o_w.append(w_r_l[i][op])
# print("-----------------one_w-------------------")
# print(o_w)
# t_w : 각 선수가 2라운드에서 이길 확률
t_w = []
for i in range(8):
    tp = i % 4
    if tp == 0:
        op_l = [i + 2, i + 3]
    elif tp == 1:
        op_l = [i + 1, i + 2]
    elif tp == 2:
        op_l = [i - 2, i - 1]
    elif tp == 3:
        op_l = [i - 3, i - 2]
    to_w_r = 0
#     if i == 7:
#         print("op_l :", op_l)
    for j in op_l:
#         if i == 7:
#             print(i + 1, "이 1라운드에서 이길 확률", o_w[i])
#             print(j + 1, "이 1라운드에서 이길 확률", o_w[j])
#             print(i + 1, "이", j + 1, "한테 이길 확률", w_r_l[i][j])
        to_w_r += o_w[i] * o_w[j] * w_r_l[i][j]
    t_w.append(to_w_r)
# print("-----------two_w--------")
# print(t_w)
# thir_w : 각 선수가 3라운드에서 이길 확률
thir_w = []
for i in range(8):
    if i < 4:
        op_l = [4, 5, 6, 7]
    else:
        op_l = [0, 1, 2, 3]
    to_w_r = 0
    for j in op_l:
        to_w_r += t_w[i] * t_w[j] * w_r_l[i][j]
#         if i == 2:
#             print("i :", i, "j :", j)
#             print(to_w_r)
            
    thir_w.append(to_w_r)
# print("----------third_w-------")
# print(thir_w)

for i in thir_w:
    print(format(i,'.18f'), end=" ")
