package _Algorithm.BFS;

import java.io.*;
import java.util.*;

public class P16234 {
	static int n,L,R,i,j,c,a[][],p[]= {1,0,-1,0},q[]= {0,1,0,-1},b[][],l=1,u,v[],m[];
	static void o(int x,int y,int c) {
		b[x][y]=c;
		u+=a[x][y];
		m[c]++;
		int i=0,X,Y;
		for(;i<4;) {
			X=x+p[i];
			Y=y+q[i++];
			if(X>=0&X<n&Y>=0&Y<n)if(b[X][Y]<1)
				if(Math.abs(a[x][y]-a[X][Y])>=L&Math.abs(a[x][y]-a[X][Y])<=R)
					o(X,Y,c);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		L=Integer.parseInt(t.nextToken());
		R=Integer.parseInt(t.nextToken());
		a=new int[n][n];
		for(;i<n;i++) {
			t=new StringTokenizer(r.readLine());
			for(j=0;j<n;a[i][j++]=Integer.parseInt(t.nextToken()));
		}
		for(;l>0;) {
			l=c=0;
			b=new int[n][n];
			v=new int[n*n+1];
			m=new int[n*n+1];
			for(i=0;i<n;i++)
				for(j=0;j<n;j++)
					if(b[i][j]<1) {
						u=0;
						o(i,j,++c);
						v[c]=u;
						l+=m[c]>1?1:0;
					}
			for(int[]c:b)System.out.println(Arrays.toString(c));
			System.out.println(Arrays.toString(v));
			System.out.println(Arrays.toString(m));
			for(i=0;i<n;i++)for(j=0;j<n;j++)if(m[b[i][j]]>1)a[i][j]=v[b[i][j]]/m[b[i][j]];
			for(int[]c:a)System.out.println(Arrays.toString(c));
		}
	}

}
