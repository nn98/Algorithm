package Baekjoon;

import java.util.Scanner;

public class Q2439 {

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=s.nextInt();
		for(int i=1;i<=N;i++) {
			for(int k=N-i;k>0;k--) System.out.print(" ");
			for(int j=i;j>0;j--) System.out.print("*");
			System.out.println();
		}
	}

}
