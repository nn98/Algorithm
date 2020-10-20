package _Algorithm.Math;

import java.math.BigInteger;

public class P2052 {

	public static void main(String[] args) {
		BigInteger m=new BigInteger("2");
		int n=new java.util.Scanner(System.in).nextInt();
		m=m.pow(n);
		System.out.println(m);
		System.out.println(BigInteger.ONE.divide(m));
	}

}
