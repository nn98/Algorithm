package _Algorithm.DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1240_2 {
	static int n,m,i,j,l,v[],a[][];
	static void o(int x,int u) {
//		System.out.println(x+" "+u);
		v[x]=u;
		if(x!=i) {
			for(int y=0;++y<n;) {
				if((v[y]>u+a[x][y]|v[y]<1)&a[x][y]>0)
					o(y,u+a[x][y]);
			}
		}else j=j<v[x]?j:v[x];
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		l=n=Integer.parseInt(t.nextToken())+1;
		m=Integer.parseInt(t.nextToken());
		a=new int[n][n];
		while(--l>1) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			a[i][j]=a[j][i]=Integer.parseInt(t.nextToken());
		}while(m-->0) {
			j=Integer.MAX_VALUE;
			v=new int[n];
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			o(Integer.parseInt(t.nextToken()),0);
			w.write(j+"\n");
		}
		w.flush();
	}

}