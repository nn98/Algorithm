package _Algorithm.BFS;

import java.io.*;
import java.util.*;

public class P16234 {
	static int n,L,R,i,j,c,a[][],p[]= {1,0,-1,0},q[]= {0,1,0,-1},b[][],l,u;
	static void o(int x,int y,int c) {
		
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
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				if(b[i][j]<1)o(i,j,c);
	}

}
