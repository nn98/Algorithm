package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;
public class P12837 {
	static int n,m,i,j,a[],l=1;
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
	}
	static int p(int n,int s,int e) {
		if(s>j|e<i)return 0;
		if(s>=i&e<=j)return a[n];
		int m=(s+e)/2;
		return p(n*2,s,m)+p(n*2+1,m+1,e);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		for(;l<n;l*=2);
		a=new int[l*2];
		for(m=Integer.parseInt(t.nextToken());m-->0;) {
			t=new StringTokenizer(r.readLine());
			switch(t.nextToken()) {
			case "1":
				j=Integer.parseInt(t.nextToken())+l-1;
				a[j]=Integer.parseInt(t.nextToken());
				o();
				break;
			default:
				i=Integer.parseInt(t.nextToken());
				j=Integer.parseInt(t.nextToken());
				w.write(p(1,1,l)+"\n");
			}
		}
		w.flush();
	}
}