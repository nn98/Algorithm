package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P16916_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char[]a=s.next().toCharArray(),b=s.next().toCharArray();
		BigInteger n=BigInteger.ZERO,m;
		for(int i=0;i++<b.length;n=n.add(new BigInteger(""+i*b[i-1])));
		System.out.println(n);
	}

}
