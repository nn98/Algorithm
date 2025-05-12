var nextX = [1, 0, -1, 0];
var nextY = [0, 1, 0, -1];
function solution(N, M, D, L) {
    let his = Array(N).fill([]);
    for (let i = 0; i < N; i++) {
        his[i]=Array(M).fill(Number.MAX_SAFE_INTEGER);
    }
    dijkstra(0, 0, 0, L, his, N, M);
    // console.log(his.join(('\n')));
    var answer = his[N - 1][M - 1] == Number.MAX_SAFE_INTEGER ? -1 : (his[N - 1][M - 1] * D);
    return answer;
}
function dijkstra(x, y, c, L, his, N, M) {
    his[x][y] = c++;
    for (let i = 0; i < 4; i++) {
        let nX = x + nextX[i];
        let nY = y + nextY[i];
        if (nX >= 0 && nX < N && nY >= 0 && nY < M) {
            if (L[nX][nY] == 0) {
                if (his[nX][nY] > c) {
                    dijkstra(nX, nY, c, L, his, N, M);
                }
            }
        }
    }
}