package _Algorithm.Divide_Conquer;

import java.util.Scanner;

public class P2357 {
	static int n,m,i,j,a[],t[],r[];
	static int o(int n,int s,int e) {
		if(s==e)return t[n]=a[s];
		int m=(s+e)/2,i=o(n*2,s,m),j=o(n*2+1,m+1,e);
		return t[n]=i<j?i:j;
	}
	static int O(int n,int s,int e) {
		if(s==e)return r[n]=a[s];
		int m=(s+e)/2,i=O(n*2,s,m),j=O(n*2+1,m+1,e);
		return r[n]=i>j?i:j;
	}
	static int p(int n,int s,int e) {
		if(i>e|j<s)return Integer.MAX_VALUE;
		if(i<=s&e<=j)return t[n];
		int m=(s+e)/2,a=p(n*2,s,m),b=p(n*2+1,m+1,e);
		return a<b?a:b;
	}
	static int P(int n,int s,int e) {
		if(i>e|j<s)return 0;
		if(i<=s&e<=j)return r[n];
		int m=(s+e)/2,a=P(n*2,s,m),b=P(n*2+1,m+1,e);
		return a>b?a:b;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();m=s.nextInt();
		a=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		for(i=1;i<n;i*=2);
		i*=2;
		t=new int[i];
		r=new int[i];
		o(1,0,--n);
		O(1,0,n);
		for(;m-->0;) {
			i=s.nextInt()-1;
			j=s.nextInt()-1;
			System.out.println(p(1,0,n)+" "+P(1,0,n));
		}
	}
}