package BaekJoon.Math;

import java.util.Scanner;
public class P1297{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		double z=Math.sqrt(b*b+c*c);
		System.out.print((int)(a*b/z)+" "+(int)(a*c/z));
	}
}