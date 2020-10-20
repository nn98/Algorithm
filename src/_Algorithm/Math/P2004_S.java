package _Algorithm.Math;

import java.util.Scanner;

public class P2004_S {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),t=0,f=0;
		long i=2;
		for(;i<=n;i*=2)t+=(n/i)-(m/i)-((n-m)/i);
		for(i=5;i<=n;i*=5)f+=(n/i)-(m/i)-((n-m)/i);
		System.out.print(t<f?t:f);
	}

}
