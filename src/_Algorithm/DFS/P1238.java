package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1238 {

	static int n,m,x,z,i,j,a[][],h[][];
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		x=Integer.parseInt(t.nextToken());
		for(;z++<m;t=new StringTokenizer(r.readLine()),i=Integer.parseInt(t.nextToken()),j=Integer.parseInt(t.nextToken()),a[i][j]=a[j][i]=Integer.parseInt(t.nextToken()));
		for(int[]b:a)System.out.println(Arrays.toString(b));
	}

}
