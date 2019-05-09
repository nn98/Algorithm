package BaekJoon;

import java.util.Scanner;

public class P17175 {
	/*
	static void sol(int N) {
		count++;
		if(N>1) {
			sol(N-2);
			sol(N-1);
		}
	}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		long[] r=new long[N+1];
		if(N<2) {
			System.out.println(1);
			return;
		}
		r[0]=1;
		r[1]=1;
		for(int i=2;i<=N;i++) r[i]=r[i-1]+r[i-2]+1;
		System.out.println(r[N]%1000000007);
	}
}