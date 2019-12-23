package BaekJoon;

import java.util.Scanner;

public class P2355 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int f=s.nextInt(),t=s.nextInt();
		long r=t+f;
		r=r*((t-f+1)/2)+((t-f)%2==0?(f+t)/2:0);
		System.out.println(r);
	}
}