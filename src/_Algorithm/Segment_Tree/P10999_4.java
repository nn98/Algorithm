package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

// crash?

public class P10999_4 {
	
	static long[]a,b,c;
	static int n,i,m,N,l,S,x,y;
	
	static void o(){
		for(;x>0;x/=2,a[x]=a[x*2]+a[x*2+1]);
	}
	
	static void u(int n,int s,int e) {
		
		if(s>y|e<x) {
			
			
			
		}
		
	}

	public static void main(String[] args)throws Exception{
		
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		
		n=Integer.parseInt(t.nextToken());
		a=new long[n];
		m=Integer.parseInt(t.nextToken())+Integer.parseInt(t.nextToken());
		while(i<n)a[i++]=Integer.parseInt(r.readLine());
		
		l=1;
// 		while(l<n*2)l*=2;
// 		L=l/2;
// 		b=new long[L];
// 		c=new long[L];
		
		while(l<=n)l*=2;
		b=new long[l];
		c=new long[l];
		S=l/2;
		
		for(i=0;i<n;x=i+S,o());
		
		while(m-->0) {
			
			t=new StringTokenizer(r.readLine());
			N=Integer.parseInt(t.nextToken());
			if(N==1) {
				
				
				
			}else {
				
				
				
			}
			
		}
		
	}

}
