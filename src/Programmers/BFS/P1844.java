package Programmers.BFS;

import java.util.Arrays;

public class P1844 {
	static int n,m,a[][],h[][],p[]= {0,1,0,-1},q[]= {1,0,-1,0};
	static public int solution(int[][] maps) {
        int i=0,j;
        a=maps;
        n=a.length;
        m=a[0].length;
        h=new int[n][m];
        for(;i<n;i++)for(j=0;j<m;j++)if(a[i][j]>0)o(i,j,1);
        return h[n-1][m-1]<1?-1:h[n-1][m-1];
    }
	static void o(int x,int y,int v) {
		h[x][y]=v++;
		int i=0,X,Y;
		for(;i<4;i++) {
			X=p[i]+x;
			Y=q[i]+y;
			if(X>=0&X<n&Y>=0&Y<m)if((h[X][Y]<1|h[X][Y]>v)&a[X][Y]>0)o(X,Y,v);
		}
	}
	public static void main(String[] args) {
		int[][]a={{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		System.out.println(solution(a));
		for(int[]b:h)System.out.println(Arrays.toString(b));
	}

}
