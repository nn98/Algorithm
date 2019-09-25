package BaekJoon;

import java.util.Scanner;

public class P2749 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		int a=0,b=1;
		for(int i=2;i<=n;i++) {
			int t=(a+b)%1000000;
			a=b;
			b=t;
		}
		if(n==0) System.out.println(a);
		else System.out.println(b);
	}
}
//0