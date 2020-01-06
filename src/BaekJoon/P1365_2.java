package BaekJoon;

import java.util.Scanner;

public class P1365_2 {
	static int n,a[],h[],i=0,r;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		h=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		
		System.out.print(n-r);
	}
}
