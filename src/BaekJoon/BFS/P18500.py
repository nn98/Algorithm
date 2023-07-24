from sys import stdin

input = stdin.readline
from collections import deque  

def fall(f_list, visited):  
    fall_dist, flag = 1, True  
    while True:  
        for fi, fj in f_list:  
            # 아래가 바닥이거나  
            # 2칸 아래가 미네랄이면 종료            
            if fi+fall_dist == R-1 or (arr[fi+fall_dist+1][fj] == 'x' and not visited[fi+fall_dist+1][fj]):  
                flag = False  
                break  
        if not flag:  
            break  
        fall_dist += 1  

    # 추락시켜주기  
    # 아래에서부터 해주어야 한다.    
    # 바닥 위에서부터 체크    
    for fi in range(R-fall_dist-1, -1, -1):  
        for j in range(C):  
            if arr[fi][j] == 'x' and visited[fi][j]:  
                arr[fi][j] = '.'  
                arr[fi+fall_dist][j] = 'x'  

def check(ci, cj):  
    visited = [[False] * C for _ in range(R)]  
    q = deque()  
    q.append((ci, cj))  
    visited[ci][cj] = True  
    fall_list = []  
    while q:  
        si, sj = q.popleft()  
        # 바닥이라면 추락할 필요 없으니 return  
        if si == R-1:  
            return  
        if arr[si+1][sj] == '.':  
            fall_list.append((si, sj))  
        for d in range(4):  
            ni, nj = si+di[d], sj+dj[d]  
            if 0<=ni<R and 0<=nj<C and visited[ni][nj] == False and arr[ni][nj] == 'x':  
                q.append((ni, nj))  
                visited[ni][nj] = True  

    # 바닥에 닿지 않았다면 추락해야되므로 fall 함수  
    fall(fall_list, visited)  


def destroy(direct, height):  
    des_mineral = -1  
    # 왼쪽에서 던짐  
    if not direct:  
        for j in range(C):  
            if arr[height][j] == 'x':  
                arr[height][j] = '.'  
                des_mineral = j  
                break  
    else:  
        for j in range(C-1, -1, -1):  
            if arr[height][j] == 'x':  
                arr[height][j] = '.'  
                des_mineral = j  
                break  

    # 미네랄 파괴후, 새로운 클러스터가 생기고  
    # 클러스터가 떨어지는 조건에 만족한다면 리스트에 담아 반환해준다.    
    new_cluster = []  
    if not des_mineral == -1:  
        for d in range(4):  
            ni, nj = height + di[d], des_mineral + dj[d]  
            if 0<=ni<R and 0<=nj<C and arr[ni][nj] == 'x':  
                new_cluster.append([ni, nj])  
    return new_cluster  



R, C = map(int, input().split())  
arr = [list(input().rstrip()) for _ in range(R)]  
N = int(input())  
query = [*map(int, input().split())]  
di, dj = [1, -1, 0, 0], [0, 0, 1, -1]  

for idx, h in enumerate(query):  
    val = destroy(idx % 2, R-h)  
    if val:  
        for i, j in val:  
            check(i, j)  

for i in arr:  
    print(''.join(i))
