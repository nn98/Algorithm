package _Algorithm.Math;

import java.math.BigInteger;

public class P2052 {

	public static void main(String[] args) {
		BigInteger m=new BigInteger("2");
		m=m.pow(new java.util.Scanner(System.in).nextInt());
		System.out.println(m);
		System.out.println(BigInteger.ONE.divide(m));
	}

}
