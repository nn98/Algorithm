package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1953_2 {

	static int n,m,i,j,R,a[][],b[],h[];
	static void o(int x,int t) {
		b[x] = t;
		h[x] = 1;
		for(int i=0;++i<n;)if(a[x][i]>0&h[i]<0)o(i,-t);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer f=new StringBuffer();
		n=Integer.parseInt(r.readLine())+1;
		a=new int[n][n];
		for(;++i<n;)for(j=0;++j<n;a[j][i]=a[i][j]=1);
		h=new int[n];
		b=new int[n];
		for(i=0;++i<n;)if(h[i]<1)o(i,1);
		for(i=0;++i<n;)m+=b[i]>0?1:0;
		System.out.println(m);
		for(i=0;++i<n;)if(b[i]>0)System.out.print(i+" ");
		System.out.println(n-m-1);
		for(i=0;++i<n;)if(b[i]<0)System.out.print(i+" ");
	}

}
