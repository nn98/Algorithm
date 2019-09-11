package Baekjoon;

import java.util.Scanner;

public class P1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt();
		if(a>b) System.out.println(">");
		else if(a<b) System.out.println("<");
		else if(a==b) System.out.println("==");
	}

}
