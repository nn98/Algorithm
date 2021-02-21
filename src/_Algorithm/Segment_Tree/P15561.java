package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

public class P15561 {

	static int n,m,i,j,x,y,l,p,q,a[],u,v;
	static void o() {
		for(;i>1;i/=2,a[i]=a[i*2]+a[i*2+1]);
	}
	static int p(int n,int s,int e) {
		if(e<x|y<s)return 0;
		if(x<=s&e<=y)return a[n];
		int m=(s+e)/2;
		return p(n*2,s,m)+p(n*2+1,m+1,e);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		u=Integer.parseInt(t.nextToken());
		v=Integer.parseInt(t.nextToken());
		l=1;
		for(;l<=n;l*=2);
		
		while(m-->0) {
			t=new StringTokenizer(r.readLine());
			
		}
	}

}
