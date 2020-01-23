package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P4150 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=2;
		BigInteger a=BigInteger.ZERO,b=BigInteger.ONE;
		for(;i<=n;i++) {
			b=a.add(b);
			a=b.subtract(a);
		}
		System.out.print(n<3?1:b);
	}
}
