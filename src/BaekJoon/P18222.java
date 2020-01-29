package BaekJoon;

import java.math.BigInteger;

public class P18222 {

	public static void main(String[] args) {
		BigInteger a=BigInteger.ONE,n=new BigInteger(new java.util.Scanner(System.in).next());
		int i=0;
		while(a.compareTo(n)<0)a=a.pow(2);
		System.out.println(a);
	}

}
