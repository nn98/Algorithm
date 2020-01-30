package BaekJoon;

import java.util.Scanner;
public class P2965_2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		System.out.print(b-a>c-b?b-a-1:c-b-1);
	}
}