package _Algorithm.Math;

import java.math.BigDecimal;

public class P2052 {

	public static void main(String[] args) {
		BigDecimal m=new BigDecimal("2");
		int n;
		m=m.pow(new java.util.Scanner(System.in).nextInt());
		System.out.println(BigDecimal.ONE.divide(m));
	}

}
