package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P16428 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BigInteger a=new BigInteger(s.next()),b=new BigInteger(s.next()),c;
		System.out.println(a.divide(b));
		
		try {
			System.out.print(a.mod(b));
		} catch(Exception e) {
			c=a.divide(b).add(BigInteger.ONE);
			System.out.println(a.subtract(b.multiply(c)));
		}
	}

}
