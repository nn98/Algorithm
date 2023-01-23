package BaekJoon.DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1967 {

	static int n,a[][],h[],i,j,m,v,d[][];
	static void o(int x,int v) {
		System.out.println(String.format("bigin %d, now %d, val %d",j+1,x+1,v)+"d["+x+"]"+Arrays.toString(d[x]));
		for(int i=0;i<n;i++)if(i!=j)if(a[x][i]>0)if(h[i]<1) {
			h[x]++;
			d[j][x]=d[x][j]=v;
			System.out.println("d["+x+"]"+Arrays.toString(d[x]));
			o(i,v+d[i][x]);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n][n];
		d=new int[n][n];
		while(++m<n) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken())-1;
			j=Integer.parseInt(t.nextToken())-1;
			v=Integer.parseInt(t.nextToken());
			d[j][i]=d[i][j]=v;
			a[i][j]=a[j][i]=1;
			h=new int[n];
			o(i,v);
		}
		for(int[]b:a)System.out.println(Arrays.toString(b));
		for(int[]b:d)System.out.println(Arrays.toString(b));
	}

}
