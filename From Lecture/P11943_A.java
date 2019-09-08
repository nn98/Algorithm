package BaekJoon;

import java.util.Scanner;

public class P11943_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt(),
				r=a+d<b+c?a+d:b+c;
		System.out.println(r);
	}
}