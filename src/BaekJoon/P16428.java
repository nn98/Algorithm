package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P16428 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BigInteger a=new BigInteger(s.next()),b=new BigInteger(s.next()),c=a.divide(b),d=null;
		try {
			d=a.mod(b);
			System.out.print(c+"\n"+d);
		} catch(Exception e) {
			switch(a.signum()) {
			case 0:
				c=d=BigInteger.ZERO;
				break;
			case -1:
				switch(b.signum()) {
				case -1:
					c=c.add(BigInteger.ONE);
					d=a.subtract(b.multiply(c));
					break;
				case 1:
					break;
				}
				break;
			case 1:
				switch(b.signum()) {
				case -1:
					break;
				case 1:
					break;
				}
				break;
			}
			System.out.print(c+"\n"+d);
		}
	}

}
