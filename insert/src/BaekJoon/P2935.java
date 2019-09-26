package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P2935 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BigInteger a=new BigInteger(s.nextLine()),b;
		String t=s.nextLine();
		b=new BigInteger(s.nextLine());
		if(t.equals("+")) System.out.print(a.add(b));
		else System.out.print(a.multiply(b));
	}
}