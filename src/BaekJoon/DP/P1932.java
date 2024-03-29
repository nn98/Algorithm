package BaekJoon.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
			for(;j<i;j++) {
				a[i-1][j]=Integer.parseInt(t.nextToken());
				if(i==n)b[i-1][j]=a[i-1][j];
			}
		}
		for(;i-->0;) {
			for(j=0;j<i;j++)
				b[i-1][j]=(b[i][j]>b[i][j+1]?b[i][j]:b[i][j+1])+a[i-1][j];
		}
		System.out.print(b[0][0]);
	}
}