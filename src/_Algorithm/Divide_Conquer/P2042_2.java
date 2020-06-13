package _Algorithm.Divide_Conquer;

import java.util.Scanner;

public class P2042_2 {

	static int n,m,i,x;
	static long d,a[],t[];
	static long o(int n,int s,int t) {
		return 0;
	}
	static void p(int n,int s,int t,int x,long d) {
	}
	static long u(int n,int s,int t,int l,int r) {
		return 0;
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
		for(;m-->0;) {
			if(s.nextInt()==1) {
				x=s.nextInt()-1;
				d=a[x]-s.nextInt();
				p(1,0,n-1,x,d);
			}else
				System.out.println(u(1,0,n-1,s.nextInt(),s.nextInt()));
		}
	}
}