package _Algorithm.DP;

import java.io.*;
import java.util.StringTokenizer;
public class P1932 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),i=0,j,u,a[][]=new int[n][],b[][]=new int[n][];
		for(;i<n;) {
			j=0;
			a[i]=new int[i+1];
			b[i]=new int[i+++1];
			StringTokenizer t=new StringTokenizer(r.readLine());
			for(;j<i;a[i-1][j++]=Integer.parseInt(t.nextToken()));
		}
		for(;i-->0;) {
			for(j=0;j<i;j++)
				b[i-1][j]=a[i][j]>a[i][j+1]?a[i][j]:a[i][j+1];
		}
		System.out.println(b[0][0]);
	}
}