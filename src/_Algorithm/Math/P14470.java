package _Algorithm.Math;

import java.util.Scanner;

public class P14470 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[5],i=0;
		for(;i<5;a[i++]=s.nextInt());
		System.out.print(((a[0]<0)?(Math.abs(a[0])*a[2]+a[1]*a[4]):((a[1]-a[0])*a[4]))+(a[0]<0?a[3]:0));
	}

}
