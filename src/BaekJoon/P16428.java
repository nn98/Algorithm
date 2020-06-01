package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P16428 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BigInteger a=new BigInteger(s.next()),b=new BigInteger(s.next()),c=a.divide(b),d;
		try {
			d=a.mod(b);
		} catch(Exception e) {
			switch(a.signum()) {
			case 0:
				c=d=BigInteger.ZERO;
				break;
			case -1:
				switch(b.signum()) {
				case -1:
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
		}
	}

}
