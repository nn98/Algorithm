package _Algorithm.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P21736 {
	static int n,m,i,j,h[][],p[]= {0,1,0,-1},q[]= {1,0,-1,0},r;
	static char[][]a;
	static void o(int x,int y) {
		h[x][y]++;
		if(a[x][y]=='P')r++;
		int i=0,X,Y;
		for(;i<4;i++) {
			X=x+p[i];
			Y=y+q[i];
			if(X>=0&X<n&Y>=0&Y<m)if(a[X][Y]!='X'&h[X][Y]<1)o(X,Y);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String[]b=r.readLine().split(" ");
		n=Integer.parseInt(b[0]);
		m=Integer.parseInt(b[0]);
		a=new char[n][];
		for(;i<n;a[i++]=r.readLine().toCharArray());
		for(;j<n;j++)for(i=0;i<m;i++)if(a[j][i]=='I')o(j,i);
		System.out.println(r<1?"TT":r);
	}

}
