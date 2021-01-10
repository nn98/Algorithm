package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

// crash?

public class P10999_4 {
	
	static long[]a,t,c;
	static int n,i,m,N,l,S,x,y;
	
	static void o(){
		for(;x>0;x/=2,t[x]=t[x*2]+t[x*2+1]);
	}
	
	static long u(int n,int s,int e) {
		
		if(s>y|e<x)return 0;
		if(s<=x&y<=e)return t[n];
		int m=(s+e)/2;
		return u(n*2,s,m)+u(n*2+1,m+1,e);
		
	}

	public static void main(String[] args)throws Exception{
		
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer T=new StringTokenizer(r.readLine());
		
		n=Integer.parseInt(T.nextToken());
		a=new long[n];
		m=Integer.parseInt(T.nextToken())+Integer.parseInt(T.nextToken());
		while(i<n)a[i++]=Integer.parseInt(r.readLine());
		
		l=1;
// 		while(l<n*2)l*=2;
// 		L=l/2;
// 		b=new long[L];
// 		c=new long[L];
		
		while(l<=n)l*=2;
		t=new long[l];
		c=new long[l];
		S=l/2;
		
		for(i=0;i<n;x=i+S,o());
		
		while(m-->0) {
			
			T=new StringTokenizer(r.readLine());
			N=Integer.parseInt(T.nextToken());
			if(N==1) {
				
				
				
			}else {
				
				
				
			}
			
		}
		
	}

}
