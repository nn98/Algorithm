package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P16428 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BigInteger a=new BigInteger(s.next()),b=new BigInteger(s.next()),c=a.divide(b),d;
//		try {
//			d=a.mod(b);
//		} catch(Exception e) {
//			c=c.add(BigInteger.ONE);
//			System.out.print(c);
//			d=c.add(BigInteger.ONE);
//			System.out.println(a.subtract(b.multiply(c)));
//		}
		System.out.println(c);
		System.out.println(a.remainder(b));
	}

}
