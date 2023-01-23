package BaekJoon.DFS;

import java.io.*;

public class P13565 {
	static int n,m,i,j,p[]= {0,1,0,-1},q[]= {1,0,-1,0},b[][];
	static char[][]a;
	static void o(int x,int y) {
		if(x==n-1)j++;
		if(j<1) {
			b[x][y]++;
			int i=0,X,Y;
			for(;i<4;i++) {
				X=x+p[i];
				Y=y+q[i];
				if(X>=0&X<n&Y>=0&Y<m)if(a[X][Y]<'1'&b[X][Y]<1)o(X,Y);
			}
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String[]c=r.readLine().split(" ");
		n=Integer.parseInt(c[0]);
		m=Integer.parseInt(c[0]);
		a=new char[n][m];
		for(;i<n;a[i++]=r.readLine().toCharArray());
		b=new int[n][m];
		for(i=0;i<m;i++)if(a[0][i]<'1')o(0,i);
		System.out.println(j<1?"NO":"YES");
	}
}
