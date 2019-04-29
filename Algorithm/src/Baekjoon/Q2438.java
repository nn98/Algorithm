package Baekjoon;

import java.util.Scanner;

public class Q2438 {

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=s.nextInt();
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) System.out.print("*");
			System.out.println();
		}
	}

}
