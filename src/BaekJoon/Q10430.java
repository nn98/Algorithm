package Baekjoon;

import java.util.Scanner;

public class Q10430 {

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=s.nextInt();
		int B=s.nextInt();
		int C=s.nextInt();
		System.out.println((A+B)%C);
		System.out.println((A%C + B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%C * B%C)%C);
	}

}
