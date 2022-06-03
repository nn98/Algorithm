package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1953_2 {

	static int n,m,i,j,R,a[][],b[],h[];
	static void o(int x,int t) {
		System.out.println("x: "+x+" t: "+t);
		b[x] = t;
		h[x] = 1;
		for(int i=0;++i<n;) {
			System.out.println(a[x][i]>0);
			System.out.println(h[i]<1);
			if(a[x][i]>0&h[i]<1)o(i,-t);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer f=new StringBuffer();
		n=Integer.parseInt(r.readLine())+1;
		a=new int[n][n];
		for(;++i<n;) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			R=Integer.parseInt(t.nextToken());
			for(;R-->0;) {
				j=Integer.parseInt(t.nextToken());
				a[i][j]=a[j][i]=1;
			}
		}
		h=new int[n];
		b=new int[n];
		for(i=0;++i<n;)if(h[i]<1) {
			System.out.println("o");
			o(i,1);
		}
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(h));
		for(i=0;++i<n;)m+=b[i]>0?1:0;
		System.out.println(m);
		for(i=0;++i<n;)if(b[i]>0)System.out.print(i+" ");
		System.out.println("\n"+(n-m-1));
		for(i=0;++i<n;)if(b[i]<0)System.out.print(i+" ");
	}

}
