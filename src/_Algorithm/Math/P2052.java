package _Algorithm.Math;

import java.math.BigDecimal;

public class P2052 {

	public static void main(String[] args) {
		BigDecimal m=new BigDecimal("2");
		int n=new java.util.Scanner(System.in).nextInt();
		m=m.pow(n);
		System.out.println(m);
		System.out.println(BigDecimal.ONE.divide(m));
	}

}
