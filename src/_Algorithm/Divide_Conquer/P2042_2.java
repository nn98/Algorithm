package _Algorithm.Divide_Conquer;

import java.util.Scanner;

public class P2042_2 {

	static int n,m,i,x;
	static long d,a[],t[];
	static long o(int n,int s,int e) {
		System.out.println(n+" "+s+" "+e);
		if(s==e)return t[n]=a[s];
		int m=(s+e)/2;
		return t[n]=o(n*2,s,m)+o(n*2+1,m+1,e);
	}
	static void p(int n,int s,int e,int x,long d) {
		if(x<s||x>e)return;
		t[n]+=d;
		if(s!=e) {
			int m=(s+e)/2;
			p(n*2,s,m,x,d);
			p(n*2+1,m+1,e,x,d);
		}
	}
	static long u(int n,int s,int e,int l,int r) {
		if(l>e||r<s)return 0;
		if(l<=s&&r>=e)return t[n];
		int m=(s+e)/2;
		return u(n*2,s,m,l,r)+u(n*2+1,m+1,e,l,r);
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
		o(1,0,--n);
		for(;m-->0;) {
			if(s.nextInt()==1) {
				x=s.nextInt()-1;
				d=a[x]-s.nextInt();
				p(1,0,n,x,d);
			}else
				System.out.println(u(1,0,n,s.nextInt(),s.nextInt()));
		}
	}
}