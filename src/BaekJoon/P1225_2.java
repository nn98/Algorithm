package BaekJoon;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class P1225_2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0,j=0,a[][]=new int[2][10];
		for(;i<2;i++)
			for(char c:s.next().toCharArray())
				a[i][c-'0']++;
		
//		char[]a=s.next().toCharArray(),b=s.next().toCharArray();
//		Arrays.sort(a);
//		Arrays.sort(b);
		BigInteger r=BigInteger.ZERO;

//		r=new BigInteger(""+(a[i]-'0')*(b[j]-'0'));
		System.out.print(r);
	}

}