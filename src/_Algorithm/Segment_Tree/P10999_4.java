package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

public class P10999_4 {
	
	static long[]a,b,c;
	static int n,i,m,N,l,L;
	
	static void t() {
		
		if() {}
		
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
		while(l<n*2)l*=2;
		L=l/2;
		b=new long[L];
		c=new long[L];
		
		while(m-->0) {
			
			t=new StringTokenizer(r.readLine());
			N=Integer.parseInt(t.nextToken());
			if(N==1) {
				
				
				
			}else {
				
				
				
			}
			
		}
		
	}

}
