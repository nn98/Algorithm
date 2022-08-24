package Programmers;

import java.util.Arrays;

public class P118668_2 {
	static int solution(int a,int c,int[][]p) {
		Arrays.sort(p,(X,Y)->X[0]==Y[0]?X[1]-Y[1]:X[0]-X[0]);
		int r=0,b[][]=new int[151][151],i=0,j=0,d,x=a,y=c,t=0,g;
		for(;x<151;x++,t++)for(y=c,g=t;y<151;b[x][y++]=g++);
		for(int[]z:p) {
			i=i>z[0]?i:z[0];
			j=j>z[1]?j:z[1];
			g=b[z[0]][z[1]];
			for(x=z[0]+z[2],y=z[1]+z[3];x<151&y<151;b[x][y]=Math.min(b[x][y],g+z[4]),x+=z[2],y+=z[3],g+=z[4]);
		}
		for(x=a;x<151;System.out.println(),x++)for(y=c;y<151;)System.out.print(b[x][y++]+" ");
//		for(int[]z:b)System.out.println(Arrays.toString(z));
		return r;
	}
	public static void main(String[] args) {
		System.out.println(solution(10,10,new int[][] {{10,15,2,1,2},{20,20,3,3,4}}));
//		System.out.println(solution(0,0,new int[][] {{0,0,2,1,2},{4,5,3,1,2},{4,11,4,0,2},{10,4,0,4,2}}));
	}

}
