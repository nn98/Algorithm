package _Algorithm.DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1967 {

	static int n,a[][],h[],i,j,m,v;
	static void o(int x,int v) {
		h[x]++;
		for(int i=0;i<n;i++)if(a[x][i]>0)if(h[i]<1) {
			a[j][x]=a[x][j]=v;
			o(i,v+a[i][x]);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n][n];
		while(m++<n) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(r.readLine())-1;
			j=Integer.parseInt(r.readLine())-1;
			v=Integer.parseInt(r.readLine());
			a[i][j]=a[j][i]=v;
			h=new int[n];
			o(j,v);
		}
		for(int[]b:a)System.out.println(Arrays.toString(b));
	}

}
