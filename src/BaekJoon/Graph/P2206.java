package BaekJoon.Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2206 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = br.readLine();
        String[] tokens = inputLine.split(" ");
        int N = Integer.parseInt(tokens[0]);
        int M = Integer.parseInt(tokens[1]);
        char[][] graph = new char[N][M];

        for (int i = 0; i < N; i++) {
            inputLine = br.readLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = inputLine.charAt(j);
            }
        }

        //        for(char []arr : graph) for(int i=0;i<arr.length;i++) System.out.print(arr[i] + (i == arr.length-1 ? "\n" : " "));

        int[][][] visited = new int[N][M][2];
        visited[0][0][1] = 1;
        int[] nX = {0,1,0,-1};
        int[] nY = {1,0,-1,0};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,0,1});
        while(!q.isEmpty()){
            int[] arr = q.poll();
            int x = arr[0];
            int y = arr[1];
            int z = arr[2];
            int distance = arr[3];
            if(visited[x][y][z]==0) visited[x][y][z]=arr[3];
            if(visited[x][y][z]<distance) continue;
            visited[x][y][z] = distance;
            distance++;
            for(int i=0;i<4;i++) {
                int nextX = x + nX[i];
                int nextY = y + nY[i];
                if(nextX < 0 || nextX >= N || nextY < 0 || nextY >= M) continue;
                int nextZ = z + (graph[nextX][nextY]=='1' ? 1 : 0);
                if(nextZ > 1) continue;
                if (visited[nextX][nextY][nextZ] == 0 || visited[nextX][nextY][nextZ] > distance) {
                    visited[nextX][nextY][nextZ] = distance;
                    q.add(new int[]{nextX,nextY,nextZ,distance});
                }
            }
        }
        // for(int i=0;i<N;i++) for(int j=0;j<M;j++) System.out.print(visited[i][j][0] + (j == M-1 ? "\n" : " "));
        // System.out.println();
        // for(int i=0;i<N;i++) for(int j=0;j<M;j++) System.out.print(visited[i][j][1] + (j == M-1 ? "\n" : " "));
        int result = -1;
        if(visited[N-1][M-1][0] != 0 && visited[N-1][M-1][1] != 0) result = Math.min(visited[N-1][M-1][0], visited[N-1][M-1][1]);
        else if(visited[N-1][M-1][0] != 0 || visited[N-1][M-1][1] != 0) result = Math.max(visited[N-1][M-1][0], visited[N-1][M-1][1]);
        System.out.println(result);
    }
}
