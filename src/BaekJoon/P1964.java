package BaekJoon;

import java.util.Scanner;

public class P1964 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),r=5,a=5,b=2;
		for(;--n>0;) {
			r+=(a+b++);
		}
		System.out.println(r);
	}

}
