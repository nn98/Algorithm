# SegTree + DP
# 현재 인덱스 -d ~ 현재 인덱스 -1까지의 최대값 + 현재 인덱스 점수
# 현재 인덱스 값이 음수라도 이전값 함치면 양수, 중복불가니 한쪽방향으로 가면 답 도출,

import math
import sys

def view_tree(tree):
    n = len(tree) - 1  # tree[0]은 안 쓴다고 가정 (1번 인덱스부터 시작)
    if n == 0:
        print("(empty tree)")
        return

    height = math.ceil(math.log2(n + 1))  # 트리의 높이 계산
    idx = 1

    for level in range(height):
        nodes_in_level = 2 ** level
        # 가운데 정렬을 위한 공백 계산
        space = 2 ** (height - level) - 1
        print(" " * space, end="")

        for i in range(nodes_in_level):
            if idx > n:
                break
            print(str(tree[idx]).center(2), end=" " * (space * 2 - 1))
            idx += 1
        print()

def update(node,left,right,idx,value):
    seg_tree[node] = max(seg_tree[node],value)
    # print(seg_tree)
    view_tree(seg_tree)
    if left == right:
        return
    mid = (left + right) // 2
    if idx <= mid:
        update(node*2,left,mid,idx,value)
    else:
        update(node*2+1,mid+1,right,idx,value)

def find_max(node,left,right,start,end):
    if start > right or end < left:
        return -math.inf
    if left == right:
        return seg_tree[node]
    if start <= left and right <= end:
        return seg_tree[node]
    mid = (left + right) // 2
    return max(find_max(node*2,left,mid,start,end),find_max(node*2+1,mid+1,right,start,end))

readline = sys.stdin.readline
n,d = map(int,readline().split())
tree_size = total_nodes = 2 * 2 ** math.ceil(math.log2(n))
print(tree_size)
dp = [0]
dp.extend(map(int,readline().split()))
seg_tree = [-math.inf]*tree_size

for i in range(1, n+1):
    dp[i] = max(dp[i],dp[i]+find_max(1,1,n,i-d,i-1))
    update(1,1,n,i,dp[i])

print(dp)
print(max(dp[1:]))
