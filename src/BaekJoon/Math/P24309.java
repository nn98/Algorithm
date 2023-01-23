package BaekJoon.Math;

import java.math.BigInteger;
import java.util.Scanner;

public class P24309 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BigInteger a=new BigInteger(s.next());
		System.out.print(new BigInteger(s.next()).subtract(new BigInteger(s.next())).divide(a));
	}

}
