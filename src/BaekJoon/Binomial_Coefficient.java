package BaekJoon;

import java.util.Scanner;

public class Binomial_Coefficient {

//	´Ü¼ø Àç±Í
	
	static long sol1(int n,int r) {
		if(n==r||r==0) return 1;
		return sol1(n-1,r-1)+sol1(n-1,r);
	}
	
	static long[][]h=new long[1001][1001];
	
	static long sol2(int n,int r) {
		if(h[n][r]>0) return h[n][r];
		if(r==0||n==r) return h[n][r]=1;
		return h[n][r]=sol2(n-1,r-1)+sol2(n-1,r);
	}
	
//	¹®µ¹ÀÌ ¾Æ¿ô
	
	static final long P=1000000007l;
	
	static final int S=4000000;
	
	static long sol3(long x,long y) {
		long r=1;
		while(y>0) {
			if(y%2!=0) {
				r*=x;
				r%=P;
			}
			x*=x;
			x%=P;
			y/=2;
		}
		return r;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
//		sol 1
		long now=System.currentTimeMillis();
		int n,r;
		n=s.nextInt();
		r=s.nextInt();
		System.out.println(sol1(n,r));
		System.out.println("runtime: "+(System.currentTimeMillis()-now));
		
//		sol 2
		now=System.currentTimeMillis();
		n=s.nextInt();
		r=s.nextInt();
		System.out.println(sol2(n,r));
		System.out.println("runtime: "+(System.currentTimeMillis()-now));
		
//		sol 3
		now=System.currentTimeMillis();
		long fac[]=new long[S+1],x,y,inv[]=new long[S+1];
		fac[1]=1;
		for(int i=1;i<=S;i++)
			fac[1]=(fac[i-1]*i)%P;
		inv[S]=sol3(fac[S],P-2);
		for(int i=S-1;i>=0;i--)
			inv[i]=(inv[i+1]*(i+1))%P;
		x=s.nextLong();
		y=s.nextLong();
		if(x==y||y==0)
			System.out.println(1);
		else {
			long result=(fac[(int) x]*inv[(int) (x-y)])%P;
			result=(result*inv[(int) y])%P;
			System.out.println(result);
		}
		System.out.println("runtime: "+(System.currentTimeMillis()-now));
	}
}