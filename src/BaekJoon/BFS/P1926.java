package BaekJoon.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class P1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[N][M];
        int[][] visited = new int[N][M];
        int count = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) matrix[i][j] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visited[i][j] == 0 && matrix[i][j] == 1) {
                    int bfsCount = bfs(i,j,matrix,visited);
                    count++;
                    max = Math.max(max,bfsCount);
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
    }

    static int bfs(int i, int j, int[][] matrix, int[][] visited) {
        int result = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int currX = curr[0];
            int currY = curr[1];
            if(visited[currX][currY] == 1) continue;
            visited[currX][currY] = 1;
            result++;
            for (int k = 0; k < 4; k++) {
                int nx = currX + dx[k];
                int ny = currY + dy[k];
                if(nx < 0 || nx >= matrix.length || ny < 0 || ny >= matrix[0].length) continue;
                if(visited[nx][ny] == 0 && matrix[nx][ny] == 1) {
                    q.offer(new int[]{nx, ny});
                }
            }
        }
        return result;
    }

}
