package BaekJoon;

import java.util.Scanner;

public class P10996 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n*2;i++) {
			for(int j=0;j<n;j++) {
				if((j+i)%2==0) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
