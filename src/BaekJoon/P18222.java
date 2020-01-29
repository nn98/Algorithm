package BaekJoon;

import java.math.BigInteger;

public class P18222 {

	public static void main(String[] args) {
		BigInteger a=new BigInteger("2"),n=new BigInteger(new java.util.Scanner(System.in).next());
		int i=0;
		while(a.pow(i++).compareTo(n)<=0);
		System.out.println(a.pow(i));
	}

}
