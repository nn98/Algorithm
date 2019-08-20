package BaekJoon;

import java.util.Scanner;

public class P1629 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		for(int i=0;i<b;i++) {
			System.out.println(a);
			a*=a;
			a%=c;
		}
		System.out.println(a);
	}
}
