package _Algorithm.DP;

import java.io.*;
import java.util.StringTokenizer;
public class P1932 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),i=0,j,u=0,a[][]=new int[n][],b[][]=new int[n][];
		for(;i<n;) {
			j=0;
			a[i]=new int[i+1];
			b[i]=new int[i+++1];
			StringTokenizer t=new StringTokenizer(r.readLine());
			for(;j<i;a[i][j++]=Integer.parseInt(t.nextToken()));
		}
	}

}
