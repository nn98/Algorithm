package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P9507 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j;
		BigInteger[]a=new BigInteger[68];
		a[0]=BigInteger.ONE;
		for(;i++<67;) {
			a[i]=a[i-1];
			for(j=i;j-->0;a[i]=a[i].add(a[j]));
		}
		for(;n-->0;)System.out.println(a[s.nextInt()]);
	}
}