package _Algorithm.DFS;

import java.io.*;
import java.util.*;
public class P2617 {
	static int n,m,i,j,k,a[][],v[];
	static void h(int x) {
		v[x]++;
		for(int i=0;++i<n;)
			if(a[x][i]>0)
				if(v[i]<1)h(i);
	}
	static void l(int x) {
		v[x]++;
		for(int i=0;++i<n;)
			if(a[x][i]<0)
				if(v[i]<1)l(i);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		m=Integer.parseInt(t.nextToken());
		v=new int[n];
		a=new int[n][n];
		for(;m-->0;) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			a[j][i]=1;
			a[i][j]=-1;
		}
	}

}
