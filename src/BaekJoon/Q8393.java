package Baekjoon;

import java.util.Scanner;

public class Q8393 {
	static Scanner s=new Scanner(System.in);
	public static void main(String args[]) {
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.print(sum);
	}
}
