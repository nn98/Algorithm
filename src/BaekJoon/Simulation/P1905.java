package BaekJoon.Simulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1905 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int[][] matrix = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
        int boxs = Integer.parseInt(st.nextToken());
        int result=0;
        for (; boxs > 0; boxs--) {
            st = new StringTokenizer(reader.readLine());
            int lx = Integer.parseInt(st.nextToken());
            int ly = Integer.parseInt(st.nextToken());
            int lz = Integer.parseInt(st.nextToken());
            int px = Integer.parseInt(st.nextToken());
            int py = Integer.parseInt(st.nextToken());
            int max=0;
            for(int i=px;i<px+lx;i++){
                for(int j=py;j<py+ly;j++){
//                    matrix[i][j]+=lz;
                    max=Math.max(max,matrix[i][j]);
                }
            }
            for(int i=px;i<px+lx;i++){
                for(int j=py;j<py+ly;j++){
                    matrix[i][j]=max+lz;
                    result=Math.max(result,matrix[i][j]);
                }
            }
//            for(int[]m:matrix) System.out.println(Arrays.toString(m));
        }
        System.out.print(result);
    }
}
