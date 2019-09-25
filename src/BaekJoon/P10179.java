package BaekJoon;

import java.util.Scanner;

public class P10179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			double j=s.nextDouble();
			System.out.printf("$%.2f\n",j*.8);
		}
	}
}