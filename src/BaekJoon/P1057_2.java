package BaekJoon;

import java.util.Scanner;

public class P1057_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		s.next();
		int a=s.nextInt(),b=s.nextInt(),r=0;
		while(a!=b) {
			a=++a/2;
			b=++b/2;
			r++;
		}
		System.out.print(r);
	}
}