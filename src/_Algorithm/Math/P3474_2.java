package _Algorithm.Math;

import java.util.Scanner;

public class P3474_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong(),a,b,c,d,e;
		while(n-->0) {
			a=s.nextLong();
			e=b=1;
			c=0;
			while(b++<a) {
				e*=b;
				d=1;
				while(e%10==0) {
					e/=10;
					c++;
				}
				e%=10;
			}
			System.out.println(c);
		}
	}
}