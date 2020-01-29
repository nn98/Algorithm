package BaekJoon;

import java.math.BigInteger;

public class P18222 {

	public static void main(String[] args) {
		BigInteger a=new BigInteger("2"),n=new BigInteger(new java.util.Scanner(System.in).next());
		int i=0,c=0;
		while(n.compareTo(a.pow(i+1))>=0)i++;
		while(!n.equals(BigInteger.ZERO)) {
//			if(n.divide(a.pow(i)).equals(BigInteger.ONE))c++;
//			c+=Integer.parseInt(n.divide(a.pow(i)).toString());
//			System.out.println(n.divide(a.pow(i)));
			c+=n.divide(a.pow(i)).equals(BigInteger.ONE)?1:0;
			n=n.mod(a.pow(i--));
		}
		System.out.println(c%2);
	}
}