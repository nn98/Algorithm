package _Algorithm.Math;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		BigInteger a=BigInteger.ONE;
		int m=new java.util.Scanner(System.in).nextInt(),n=m+1,t=0,f=0,i;
		for(;n-->2;) {
			a=a.multiply(new BigInteger(""+n));
		}
		for(i=2;i<=m;i*=2)t+=m/i;
		for(i=5;i<=m;i*=5)f+=m/i;
		System.out.println(t<f?t:f);
		System.out.println(a);
	}

}
