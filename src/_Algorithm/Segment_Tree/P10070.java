package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

public class P10070 {
	static int n,m,i,j,a[],b[],c,l=1,v;
	static void o(int n,int s,int e) {
		if(s>j|e<i)return;
		if(i<=s&e<=j)b[n]=c<2?v:-v;
		int m=(s+e)/2;
		o(n*2,s,m);
		o(n*2+1,m+1,e);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		t=new StringTokenizer(r.readLine());
		for(;l<n;l*=2);
		a=new int[l*2];
		b=new int[l*2];
		for(;m-->0;) {
			t=new StringTokenizer(r.readLine());
			c=Integer.parseInt(t.nextToken());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			v=Integer.parseInt(t.nextToken());
			o(1,1,l);
//			if(c<2)o(1,1,l);
//			else o(1,1,l);
		}
		System.out.println(Arrays.toString(b));
	}

}
