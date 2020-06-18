package _Algorithm.Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class P11505_4 {
	static int n,m,i,x;
	static long d,a[],t[],M=1000000007,v;
	static long o(int n,int s,int e) {
		if(s==e)return t[n]=a[s];
		int m=(s+e)/2;
		return t[n]=o(n*2,s,m)*o(n*2+1,m+1,e)%M;
	}
	static void p(int n,int s,int e,int x,long d,long p) {
		if(x<s||x>e)return;
		t[n]/=d;
		t[n]*=p%M;
		if(s!=e) {
			int m=(s+e)/2;
			p(n*2,s,m,x,d,p);
			p(n*2+1,m+1,e,x,d,p);
		}
	}
	static long u(int n,int s,int e,int l,int r) {
		if(l>e||r<s)return 1;
		if(l<=s&&e<=r)return t[n];
		int m=(s+e)/2;
		return u(n*2,s,m,l,r)*u(n*2+1,m+1,e,l,r)%M;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt()+s.nextInt();
		a=new long[n];
		for(;i<n;a[i++]=s.nextLong());
		for(i=1;i<n;i*=2);
		i*=2;
		t=new long[i];
		Arrays.fill(t,1);
		o(1,0,--n);
		System.out.println(Arrays.toString(t));
		for(;m-->0;) {
			if(s.nextInt()==1) {
				x=s.nextInt()-1;
				i=s.nextInt();
				v=a[x];
				p(1,0,n,x,v,i);
				System.out.println(Arrays.toString(t));
			}else
				System.out.println(u(1,0,n,s.nextInt()-1,s.nextInt()-1));
		}
	}
}