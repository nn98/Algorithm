package _Algorithm.DFS;

import java.io.*;
import java.util.*;
public class P2617 {
	static int n,m,i,j,k,a[][];
	static void o(int x,int y) {
		
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		m=Integer.parseInt(t.nextToken());
		a=new int[n][n];
		for(;m-->0;) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			a[j][i]=1;
			for(k=0;++k<n;a[j][k]=a[i][k]>0?1:a[j][k]);
			a[i][j]=-1;
			for(k=0;++k<n;a[i][k]=a[j][k]<0?-1:a[i][k]);
		}
		for(int[]b:a)System.out.println(Arrays.toString(b));
		for(m=0;++m<n;) {
			
		}
	}

}
