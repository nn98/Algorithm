package BaekJoon;

import java.util.Scanner;

public class P10101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		if(a==60&&a==b&&b==c) System.out.println("Equilateral");
		else if (a+b+c==180&&(a==b||a==c||b==c)) System.out.println("Isosceles");
		else if (a+b+c==180) System.out.println("Scalene");
		else System.out.println("Error");
	}

}
