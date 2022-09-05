package _Algorithm.Simple_Implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class P1837 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BigInteger a=new BigInteger(s.next());
		for(int i=s.nextInt();i>1;i--)if(a.mod(new BigInteger(i+"")).equals(BigInteger.ZERO)) {
			System.out.println("BAD "+i);
			return;
		}
		System.out.println("GOOD");
	}

}
