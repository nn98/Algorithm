package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

public class P10999_5 {

	static int i,j,n,m,l,L[];
	static long a[],b[],x,y;
	
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
	}
	
	static long p(int n,int s,int e) {
		if(y<s|x>e)return 0;
		if(x<=s&e<=y)return a[n];
		int m=(s+e)/2;
		return p(n*2,s,m)+p(n*2+1,m+1,e);
	}
	
	static void u(int n,int s,int e) {
		
	}
	
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken())+Integer.parseInt(t.nextToken());
		L=new int[n];
		while(i<n)L[i++]=Integer.parseInt(r.readLine());
		l=1;
		for(;l<n;l*=2);
		a=new long[l*2];
		b=new long[l*2];
		while(m-->0) {
			t=new StringTokenizer(r.readLine());
			if(t.nextToken().equals("1")) {
				x=Integer.parseInt(t.nextToken())
			}
		}
	}

}
