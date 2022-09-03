package _Algorithm.Simple_Implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class P1247 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=0,i;
		for(;n++<3;) {
			BigInteger j=BigInteger.ZERO;
			for(i=s.nextInt();i-->0;j=j.add(new BigInteger(s.next())));
			System.out.println(j);
			System.out.println(j.signum());
		}
	}

}