package Programmers;

import java.util.Arrays;

public class P118668_2 {
	static int solution(int a,int c,int[][]p) {
		Arrays.sort(p,(X,Y)->X[0]==Y[0]?X[1]-Y[1]:X[0]-X[0]);
		int r=0,b[][],i=0,j=0,x=a,y=c,u,n,g,t=0,q,A=0,C=0;
		for(;i<p.length;A=Math.max(A,p[i][0]),C=Math.max(C,p[i++][1]));
//		System.out.println(A+" "+C);
		b=new int[A+1][C+1];
		for(;x<=A;x++,t++)for(y=c,g=t;y<=C;b[x][y++]=g++);
		for(int[]z:p) {
			g=b[z[0]][z[1]];
			for(x=z[0]+z[2],y=z[1]+z[3];x<=A&y<=C;) {
				b[x][y]=Math.min(b[x][y],g+z[4]);
//				for(u=x,t=b[x][y];u<x+z[2]&u<151;u++,t++)for(n=u==x?y+1:y,q=u==x?t+1:t;n<y+z[3]&n<151;b[u][n++]=q++);
//				System.out.println(n+" "+u+"="+(b[n][u-1]+1)),
				for(n=x;n<A;b[++n][y]=b[n-1][y]+1)for(u=y+1;u<=C;b[n][u]=b[n][u++-1]+1);
				x+=z[2];
				y+=z[3];
				g+=z[4];
			}
		}
		for(x=a;x<=A;System.out.println(),x++)for(y=c;y<=C;)System.out.print(b[x][y++]+"\t");
//		for(int[]z:b)System.out.println(Arrays.toString(z));
		return b[A][C];
	}
	public static void main(String[] args) {
		System.out.println(solution(10,10,new int[][] {{10,15,2,1,2},{20,20,3,3,4}}));
		System.out.println(solution(0,0,new int[][] {{0,0,2,1,2},{4,5,3,1,2},{4,11,4,0,2},{10,4,0,4,2}}));
	}

}
