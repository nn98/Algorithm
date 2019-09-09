package Baekjoon;

import java.util.Scanner;

public class MathPow {

	static long calcPow(long a,long n) {
		if(n==0) return 1;
		else {
			long temp=calcPow(a,n/2);
			if(n%2==0) return temp*temp;
			else return temp*temp*a;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long a=s.nextLong(),b=s.nextLong();
		System.out.println(calcPow(a,b));
	}

}
