package BaekJoon;

import java.util.Scanner;

public class P2475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;i++) {
			int in=s.nextInt();
			sum+=in*in;
		}
		System.out.println(sum%10);
	}

}
