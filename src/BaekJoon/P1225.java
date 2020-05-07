package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P1225 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char[]a=s.next().toCharArray(),b=s.next().toCharArray();
		int i=0,j;
		BigInteger r=BigInteger.ZERO;
		for(;i<a.length;i++)
			for(j=0;j<b.length;j++)
				r=new BigInteger(""+(a[i]-'0')*(b[j]-'0'));
		System.out.print(r);
	}

}
