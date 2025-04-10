package BaekJoon.BFS;

import java.io.BufferedReader;
import java.util.StringTokenizer;

public class P16509 {
    static int[][]dp=new int[10][9];
    static int[]goal;
    static int[]move1={-3,-2,2,3,3,2,-2,-3};
    static int[]move2={2,3,3,2,-2,-3,-3,-2};
    static int[][]routeX = {
        {-1,-2,-3}, {0,-1,-2}, {0,1,2}, {1,2,3}, {1,2,3}, {0,1,2}, {0,-1,-2}, {-1,-2,-3}
    };
    static int[][]routeY = {
        {0,1,2}, {1,2,3}, {1,2,3}, {0,1,2}, {0,-1,-2}, {-1,-2,-3}, {-1,-2,-3}, {0,-1,-2}
    };
    static int result=Integer.MAX_VALUE;
    static void o(int x,int y,int c) {
//        System.out.println(x+" "+y+" "+c);
        dp[x][y]=c;
//        if(c>7) return;
        if(x==goal[0]&y==goal[1]){
            result=Math.min(result,c);
            return;
        }
        c+=1;
        for(int i=0;i<8;i++) {
            boolean isDup=false;
            for(int j=0;j<2&!isDup;j++) {
                int rX=x+routeX[i][j];
                int rY=y+routeY[i][j];
                if(rX==goal[0]&rY==goal[1])isDup=true;
            }
            if(isDup)continue;
            int nx=x+move1[i];
            int ny=y+move2[i];
            if(nx>=0&nx<10&ny>=0&ny<9)if(dp[nx][ny]>c|dp[nx][ny]==0)o(nx,ny,c);
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[]a={Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[]b={Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        goal=b;
        o(a[0],a[1],1);
        if(result==Integer.MAX_VALUE) {
            result=-1;
        }
        System.out.print(--result);
    }
}
