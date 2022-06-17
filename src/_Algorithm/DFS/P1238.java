package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1238 {

	static int n,m,x,z,i,j,a[][],h[][];
	static void o(int x) {
		
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		m=Integer.parseInt(t.nextToken());
		x=Integer.parseInt(t.nextToken())+1;
		a=new int[n][n];
		h=new int[n][n];
		for(;z++<m;t=new StringTokenizer(r.readLine()),a[Integer.parseInt(t.nextToken())][Integer.parseInt(t.nextToken())]=Integer.parseInt(t.nextToken()));
		for(int[]b:a)System.out.println(Arrays.toString(b));
	}

}
