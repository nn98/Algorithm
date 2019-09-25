package BaekJoon;

import java.util.Scanner;

public class P11966 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long n=s.nextLong(),two=2;
		for(long i=0;n>=Math.pow(two, i);i++) {
//			System.out.println(Math.pow(two, i));
			if(Math.pow(two, i)==n) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}
}
