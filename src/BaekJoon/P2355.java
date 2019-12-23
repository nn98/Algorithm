package BaekJoon;

import java.util.Scanner;

public class P2355 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int f=s.nextInt(),t=s.nextInt();
		long r=t+f;
		System.out.println(r*(r/2));
	}

}
