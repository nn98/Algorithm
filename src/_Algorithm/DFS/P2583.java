package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P2583 {
	
	static int n,m,i,j,a[][],h[][],k,I,J,p= {1,0,-1,0},q= {0,1,0,-1},o;

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		a=new int[n][m];
		h=new int[n][m];
		k=Integer.parseInt(t.nextToken());
		for(k-->0) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			I=Integer.parseInt(t.nextToken());
			J=Integer.parseInt(t.nextToken());
			for(;i<I;i++)for(o=j;o<J;o++)a[i][o]++;
		}
		for(int[]c:a)System.out.println(Arrays.toString(c));
	}

}
