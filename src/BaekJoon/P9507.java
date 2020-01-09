package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P9507 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=1,j;
		BigInteger[]a=new BigInteger[68];
		a[i]=a[0]=BigInteger.ONE;
		for(;i++<67;) {
			j=i-1;
			a[i]=a[j];
			for(;j>0&&j>i-4;a[i]=a[i].add(a[--j]));
		}
		for(;n-->0;)System.out.println(a[s.nextInt()]);
	}
}