package Programmers.Simulation;

import java.util.Arrays;

public class P77485 {
	static public int[] solution(int n, int m, int[][]q) {
		int i=0,j,k=0,r[]=new int[q.length],a[][]=new int[n][m],x,y,t,u,w,M,I=0;
		for(;i<n;i++)for(j=0;j<m;a[i][j]=i*n+j+++1);
		for(;k<q.length;k++) {
			i=q[k][0]-1;
			j=q[k][1]-1;
			x=q[k][2]-1;
			y=q[k][3]-1;
			M=t=a[i][y];
			for(u=y;u>j;u--) {
				a[i][u]=a[i][u-1];
				M=Math.min(a[i][u],M);
			}
			for(int[]b:a)System.out.println(Arrays.toString(b));
			System.out.println();
			w=a[x][y];
			for(u=x;u>i;u--) {
				if(u==i+1) a[u][y]=t;
				else a[u][y]=a[u-1][y];
				M=Math.min(a[u][y],M);
//				M=M<a[u][y]?M:a[u][y];
			}
			for(int[]b:a)System.out.println(Arrays.toString(b));
			System.out.println();
			t=a[x][j];
			for(u=j;u<y;u++) {
				if(u==y-1) a[x][u]=w;
				else a[x][u]=a[x][u+1];
				M=Math.min(a[x][u],M);
			}
			for(int[]b:a)System.out.println(Arrays.toString(b));
			System.out.println();
			w=a[x][y];
			for(u=i;u<x;u++) {
				if(u==x-1) a[u][j]=t;
				else a[u][j]=a[u+1][j];
				M=Math.min(a[u][j],M);
			}
			for(int[]b:a)System.out.println(Arrays.toString(b));
			System.out.println();
			r[I++]=M;
		}
		return r;
	}
	public static void main(String[] args) {
		int[][]a={{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		System.out.println(Arrays.toString(solution(6,6,a)));
	}

}
