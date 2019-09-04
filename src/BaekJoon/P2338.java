package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P2338 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		BigInteger a=new BigInteger(s.nextLine()),b=new BigInteger(s.nextLine());
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
	}

}
