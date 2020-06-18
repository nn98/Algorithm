package _Algorithm.Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class SegTree_Mul_2 {
	static int n,m,i,j,a[],p,q;
	static long t[],M=1000000007;
	static void o() {
		int x=j+p-1;
		t[x]=m;
		for(;x>1;x/=2,t[x]=t[x*2]*t[x*2+1]);
	}
	static long u(int n,int s,int e,int l,int r) {
		if(e<l||s>r)return 1;
		else if(s>=l&&r>=e)return t[n];
		int x=(s+e)/2;
		return u(n*2,s,x,l,r)*u(n*2+1,x+1,e,l,r)%M;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		for(i=1;i<n;i*=2);
		j=i;
		i*=2;
		t=new long[i];
		Arrays.fill(t,1);
		for(;p++<n;m=a[p-1],o());
		j=2;
		System.out.println(Arrays.toString(t));
		System.out.println(u(1,0,n-1,0,n-2));
//		for(m=0;m<i-1;j*=2,m--)
//			for(;m<j;System.out.print(++m!=j?(t[m]+" "):"\n"));
	}

}