package BaekJoon;

import java.util.Scanner;

public class P11050 {
	
	static int sol(int n) {
		if(n==1) return n;
		return n*sol(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),r=s.nextInt();
		System.out.println(sol(n)/sol((n-r))*sol(r));
	}
}
