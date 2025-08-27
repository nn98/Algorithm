package BaekJoon.Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2206 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = br.readLine();
        String[] tokens = inputLine.split(" ");
        int N = Integer.parseInt(tokens[0]);
        int M = Integer.parseInt(tokens[1]);
        chat[][][] graph = new chat[N][M][2];
        for (int i = 0; i < N; i++) {
            inputLine = br.readLine();
            for (int j = 0; j < M; j++) {
                graph[i][j][0] = inputLine.charAt(j);
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