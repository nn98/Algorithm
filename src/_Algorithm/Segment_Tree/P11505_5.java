package _Algorithm.Segment_Tree;

import java.util.*;

public class P11505_5 {
	static int n,m,i,x,C;
	static long d,a[],t[],M=1000000007,v,T[];
	static long o(int n,int s,int e) {
		if(s==e) {
			T[C++]=n;
			return t[n]=a[s];
		}
		int m=(s+e)/2;
		return t[n]=o(n*2,s,m)*o(n*2+1,m+1,e)%M;
	}
	static void p(int n,int s,int e,int x,long d,long p) {
		if(x<s||x>e)return;
		if(s==e)if(t[n]==0)t[n]=p;
		else {
			t[n]/=d;
			t[n]*=p%M;
		}
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
		T=new long[n];
		for(;i<n;a[i++]=s.nextLong());
		for(i=1;i<n;i*=2);
		i*=2;
		t=new long[i];
		Arrays.fill(t,-1);
		o(1,0,--n);
		System.out.println(Arrays.toString(T));
		System.out.println(Arrays.toString(t));
		for(;m-->0;) {
			if(s.nextInt()==1) {
				x=s.nextInt()-1;
				i=s.nextInt();
				v=a[x];
				a[x]=i;
				p(1,0,n,x,v,i);
				System.out.println(Arrays.toString(t));
			}else
				System.out.println(u(1,0,n,s.nextInt()-1,s.nextInt()-1));
		}
	}
}