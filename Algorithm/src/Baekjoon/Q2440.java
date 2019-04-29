package Baekjoon;

import java.util.Scanner;

public class Q2440 {

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=s.nextInt();
		for(int i=N;i>0;i--) {
			for(int j=i;j>0;j--) System.out.print("*");
			System.out.println();
		}
	}

}
