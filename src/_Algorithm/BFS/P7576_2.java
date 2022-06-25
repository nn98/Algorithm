package _Algorithm.BFS;

import java.io.*;
import java.util.*;
public class P7576_2 {

	static int n,m,a[][],i,j,k,R,s[]=new int[3],h[][],p[]= {1,0,-1,0},q[]= {0,1,0,-1};
	static void o(int x,int y,int v) {
		System.out.println(x+" "+y+" "+v);
		h[x][y]=v++;
		int i=0,X,Y;
		for(;i<4;) {
			X=x+p[i];
			Y=y+q[i++];
			if(X>=0&X<n&Y>=0&Y<m) {
				if(a[X][Y]==0)if(h[X][Y]==0)o(X,Y,v);else if(h[X][Y]>v)o(X,Y,v);
			}
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		m=Integer.parseInt(t.nextToken());
		n=Integer.parseInt(t.nextToken());
		a=new int[n][m];
		h=new int[n][m];
		for(;i<n;i++) {
			t=new StringTokenizer(r.readLine());
			for(j=0;j<m;a[i][j]=Integer.parseInt(t.nextToken()),s[a[i][j++]+1]++);
		}
		for(i=0;i<n;i++)for(j=0;j<m;j++)if(a[i][j]==1)o(i,j,1);
		System.out.println(Arrays.toString(s));
		for(int[]b:h)System.out.println(Arrays.toString(b));
		for(i=0;i<n;i++)for(j=0;j<m;j++) {
			if(a[i][j]>-1&h[i][j]>0) {
				s[a[i][j]+1]--;
				s[2]++;
			}
			R=Math.max(h[i][j],R);
		}
		System.out.println(Arrays.toString(s));
		System.out.println(R-1);
	}

}
