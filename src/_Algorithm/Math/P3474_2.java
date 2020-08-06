package _Algorithm.Math;

import java.util.Scanner;

public class P3474_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong(),a,b,c,d,e;
		while(n-->0) {
			b=a=s.nextLong()+1;
			c=0;
			while(--a>1) {
				b*=a;
				d=1;
				e=0;
				while(b%10==0) {
					b/=10;
					c++;
				}
				b%=10;
			}
		}
	}

}