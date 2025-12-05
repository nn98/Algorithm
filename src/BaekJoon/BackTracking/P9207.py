from sys import stdin # 입력이 많지는 않지만 그래도 해주는 것이 좋다.
input=stdin.readline

# 4방향으로 움직이므로 아래가 필요하다.
dx=[0,0,1,-1]
dy=[1,-1,0,0]

def move(movetime): # 매 움직임마다 변하는 보드를 구현할 함수.
    global mincnt,minmove

    # 핀의 위치들을 저장해준다. 동시에 핀의 개수도 알 수 있다.
    pinloc=[]
    for i in range(5):
        for j in range(9):
            if matrix[i][j]=='o':
                pinloc.append((j,i))

    if len(pinloc)<mincnt: # 핀의 위치를 담은 배열의 크기 = 핀의 개수
        minmove=movetime # 가장 적은 움직임을 갱신해준다.
        mincnt=len(pinloc) # 가장 적은 핀의 개수를 갱신해준다.

        # 맨 처음 핀의 수를 세놓았다면
        # 맨 처음 핀의 수 - 가장 적게 남은 핀의 수가 최소 이동횟수이다.
        # 핀의 이동횟수 = 제거한 핀의 수 이기 때문이다.

    for x,y in pinloc: # 각 핀의 위치를 가져온다.
        for i in range(4): # 4방향 이동
            nx=x+dx[i]
            ny=y+dy[i]
            # 바로 인접칸만 고려할 게 아니라, 인접칸을 뛰어 넘은 칸도 고려해야 한다.
            # 따라서 인접 칸을 뛰어넘었을 때도 움직이는 것이 가능하다면
            # 인접 칸은 당연히 이동 가능하므로 비교문을 n?+d?[i]로 작성해주었다.
            if -1<nx+dx[i]<9 and -1<ny+dy[i]<5:
                if matrix[ny][nx]=='o' and matrix[ny+dy[i]][nx+dx[i]]=='.':
                    # 인접한 핀을 뛰어 넘었을 경우 핀을 지우고 그 판의 모양에서 다음 함수 실행해준다.
                    matrix[ny][nx]='.'
                    matrix[ny+dy[i]][nx+dx[i]]='o'
                    matrix[y][x]='.'
                    move(movetime+1)
                    # 다른 경우도 살펴보기 위해 핀을 제거 이전상태로 되돌려준다.
                    matrix[ny][nx]='o'
                    matrix[ny+dy[i]][nx+dx[i]]='.'
                    matrix[y][x]='o'


for tc in range(int(input())):
    mincnt=10 # 핀의 개수는 최대 8개이므로 그냥 10개로 설정해주었다.
    minmove=10 # 핀의 개수는 최대 8개이고 1개 이상으로 남기 때문에 최대 7번 이동이 가능하지만 그냥 10개로 설정했다.
    matrix=[list(input().rstrip()) for i in range(5)]
    input()
    move(0)
    print(mincnt,minmove)
