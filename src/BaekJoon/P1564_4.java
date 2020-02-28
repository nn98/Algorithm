package BaekJoon;

import java.math.BigInteger;

public class P1564_4 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i;
		BigInteger b=new BigInteger(""+n--);
		String t;
		while(n>1) {
			b=b.multiply(new BigInteger(""+n--));
			t=b.toString();
			for(i=t.length();t.charAt(--i)=='0';);
			b=new BigInteger(t.substring(0,i+1));
		}
		t=b.toString();
		System.out.println(t.substring(t.length()-5,t.length()));
	}
}