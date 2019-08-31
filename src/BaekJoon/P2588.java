package BaekJoon;

import java.util.Scanner;

public class P2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=1;
		for(int i=0;i<3;i++) {
			System.out.println(a*((b%(c*10))/c));
			c*=10;
		}
		System.out.println(a*b);
	}

}
