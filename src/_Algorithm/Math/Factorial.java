package _Algorithm.Math;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		BigInteger a=BigInteger.ONE;
		for(int n=new java.util.Scanner(System.in).nextInt();n-->0;) {
			a=a.multiply(new BigInteger(""+n));
		}
		System.out.println(a);
	}

}
