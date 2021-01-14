package _Algorithm.Math;

import java.math.BigInteger;
import java.util.Scanner;

public class P8437_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BigInteger a=new BigInteger(s.next()),b=new BigInteger(s.next())
				,c=a.divide(new BigInteger("2")),d=b.divide(new BigInteger("2"));
		if(a.mod(new BigInteger("2")).equals(BigInteger.ZERO))
			System.out.print(c.add(d)+"\n"+c.subtract(b));
		else System.out.print(c.add(d).add(BigInteger.ONE)+"\n"+c.subtract(b).subtract(BigInteger.ONE));
	}

}
