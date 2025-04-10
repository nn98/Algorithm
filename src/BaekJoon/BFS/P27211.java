package BaekJoon.BFS;

import java.io.BufferedReader;
import java.util.StringTokenizer;

public class P27211 {

    static int[][] area, visit;
    static int[]X= {-1,0,1,0};
    static int[]Y= {0,-1,0,1};
    static int result=0;
    static void o(int x,int y) {
        for(int i=0;i<4;i++) {
            int nx=x+X[i];
            int ny=y+Y[i];
            if(nx<0)nx=area.length-1;
            if(nx>=area.length)nx=0;
            if(ny<0)ny=area[0].length-1;
            if(ny>=area[0].length)ny=0;
            if(area[nx][ny]<1&visit[nx][ny]==0) {
                visit[nx][ny]=1;
                o(nx,ny);
            }
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        area = new int[a][b];
        visit = new int[a][b];
        for(int i = 0; i < a; i++) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            for(int j = 0; j < b; j++) {
                area[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        for(int i=0;i<a;i++)for(int j=0;j<b;j++)if(area[i][j]==0&visit[i][j]<1){
            o(i,j);
            result++;
        }
        System.out.println(result);
    }
}
