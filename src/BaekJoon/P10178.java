package BaekJoon;

import java.util.Scanner;

public class P10178 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int m=s.nextInt(),c=s.nextInt();
			System.out.printf("You get %d piece(s) and your dad gets %d piece(s).\n",m/c,m%c);
		}	
	}
}
