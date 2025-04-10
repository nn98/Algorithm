package BaekJoon.BFS;

import java.io.BufferedReader;
import java.util.StringTokenizer;

public class AreaTest {
    static void toVisible(int[][] area) {
        for(int i = 0; i < area.length; i++) {
            for(int j = 0; j < area[i].length; j++) {
                System.out.print((area[i][j]<1?"□":"■")+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int[][] area = new int[a][b];
        for(int i = 0; i < a; i++) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            for(int j = 0; j < b; j++) {
                area[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        toVisible(area);
    }
}
