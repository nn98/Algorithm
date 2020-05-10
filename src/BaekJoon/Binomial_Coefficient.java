package BaekJoon;

import java.util.Scanner;

public class Binomial_Coefficient {

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
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long now=System.currentTimeMillis();
		System.out.println(sol1(s.nextInt(),s.nextInt()));
		System.out.println("runtime: "+(System.currentTimeMillis()-now));
		now=System.currentTimeMillis();
		System.out.println(sol2(s.nextInt(),s.nextInt()));
		System.out.println("runtime: "+(System.currentTimeMillis()-now));
	}

}
