package BaekJoon;

import java.util.Scanner;

public class P1964 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextInt(),r=5,a=3,b=1;
		for(;--n>0;) {
			r+=a++*2+b++;
			r%=45678;
		}
		System.out.println(r);
	}
}