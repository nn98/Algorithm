package BaekJoon;

import java.util.Scanner;

public class P2355_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long a=s.nextLong(),b=s.nextLong(),t;
		if(a>b) {
			t=a;
			a=b;
			b=t;
		}
		System.out.print((a+b)*(b-a+1)/2);
	}
}
//Tq