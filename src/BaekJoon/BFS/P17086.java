package BaekJoon.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P17086 {
	static int n,m,i,j,R,a[][],h[][],p[]= {-1,-1,-1,0,0,0,1,1,1},q[]= {-1,0,1,-1,0,1,-1,0,1};
	static void o(int x,int y,int v) {
		h[x][y]=v++;
		int i=0,X,Y;
		for(;i<9;i++) {
			X=x+p[i];
			Y=y+q[i];
			if(X>=0&X<n&Y>=0&Y<m)if(h[X][Y]<1|h[X][Y]>v)o(X,Y,v);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		a=new int[n][m];
		h=new int[n][m];
		for(;i<n;i++) {
			t=new StringTokenizer(r.readLine());
			for(j=0;j<m;a[i][j++]=Integer.parseInt(t.nextToken()));
		}
		for(i=0;i<n;i++)for(j=0;j<m;j++)if(a[i][j]>0)o(i,j,0);
//		for(int[]b:h)System.out.println(Arrays.toString(b));
		for(i=0;i<n;i++)for(j=0;j<m;R=R>h[i][j]?R:h[i][j],j++);
		System.out.println(R);
	}

}
