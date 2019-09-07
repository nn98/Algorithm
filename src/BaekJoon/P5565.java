package BaekJoon;

import java.util.Scanner;

public class P5565 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int sum=s.nextInt();
		for(int i=0;i<9;i++) {
			sum-=s.nextInt();
		}
		System.out.println(sum);
	}

}
