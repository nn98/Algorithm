package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P2583 {
	
	static int n,m,i,j,a[][],h[][],k,I,J,p[]= {1,0,-1,0},q[]= {0,1,0,-1},o;

	static void p(int x,int y) {
		h[x][y]++;
		int i=0,X,Y;
		for(;i<4;i++) {
			
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		a=new int[n][m];
		h=new int[n][m];
		k=Integer.parseInt(t.nextToken());
		for(;k-->0;) {
			t=new StringTokenizer(r.readLine());
			j=Integer.parseInt(t.nextToken());
			i=Integer.parseInt(t.nextToken());
			J=Integer.parseInt(t.nextToken());
			I=Integer.parseInt(t.nextToken());
			for(;i<I;i++)for(o=j;o<J;o++)a[i][o]++;
		}
		for(int[]c:a)System.out.println(Arrays.toString(c));
		o=0;
		for(i=0;i<n;i++)for(j=0;j<m;j++)if(h[i][j]<1) {
			p(i,j);
			o++;
		}
	}

}
