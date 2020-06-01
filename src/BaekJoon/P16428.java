package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P16428 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BigInteger a=new BigInteger(s.next()),b=new BigInteger(s.next()),c=a.divide(b),d;
		try {
			d=a.mod(b);
			System.out.print(c+"\n"+d+"\n"+a.remainder(b));
		} catch(Exception e) {
			System.out.println(e);
			c=c.add(BigInteger.ONE);
			if(a.signum()<0)
				d=a.add(b.multiply(c));
			else
				d=a.subtract(b.multiply(c));
			System.out.println(c+"\n"+d);
		}
	}

}
