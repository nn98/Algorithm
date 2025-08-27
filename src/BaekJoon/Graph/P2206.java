package BaekJoon.Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2206 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][][] graph = new int[N][M][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                graph[i][j][0] = Integer.parseInt(st.nextToken());
            }
        }
        for(int [][]arr : graph) {
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i][0] + " ");
            }
            System.out.println();
        }
    }
}