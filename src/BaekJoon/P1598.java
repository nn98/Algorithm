package BaekJoon;

import java.util.Scanner;
public class P1598 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		System.out.print(Math.abs(n/4-m/4)+Math.abs(n%4==0?4:n%4-m%4==0?4:m%4));
	}
}