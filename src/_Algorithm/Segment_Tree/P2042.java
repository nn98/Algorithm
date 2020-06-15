package _Algorithm.Divide_Conquer;

import java.io.*;
import java.util.*;
public class P2042 {
	static long m,h,i,j,a[],t[];
	static long o(int n,int s,int e) {
		if(s==e)return t[n]=a[s];
		else {
			int m=(s+e)/2;
			return t[n]=o(n*2,s,m)+o(n*2+1,m+1,e);
		}
	}
	static long u(int n,int s,int e,int l,int r) {
		if(l>e||r<s)return 0;
		if(l<=s&&e<=r)return t[n];
		int m=(s+e)/2;
		return u(n*2,s,m,l,r)+u(n*2+1,m+1,e,l,r);
	}
	static void p(int n,int s,int e,int x,int d) {
		if(x<s||x>e)return;
		t[n]=t[n]+d;
		if(s!=e) {
			int m=(s+e)/2;
			p(n*2,s,m,x,d);
			p(n*2+1,m+1,e,x,d);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s=new StringTokenizer(r.readLine());
		int n=Integer.parseInt(s.nextToken());
		m=Integer.parseInt(s.nextToken())+Integer.parseInt(s.nextToken());
		a=new long[n];
		for(i=1;i<n;i*=2);
		i*=2;
		t=new long[(int)i];
		for(i=0;i<n;a[(int)i++]=Integer.parseInt(r.readLine()));
		o(1,0,n-1);
		for(;m-->0;) {
			s=new StringTokenizer(r.readLine());
			if(s.nextToken().equals("1")) {
				int x=Integer.parseInt(s.nextToken())-1,d=(int) (Integer.parseInt(s.nextToken())-a[x]);
				p(1,0,n-1,x,d);
			}else System.out.println(u(1,0,n-1,Integer.parseInt(s.nextToken())-1,Integer.parseInt(s.nextToken())-1));
		}
	}
}