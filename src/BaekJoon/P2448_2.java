package BaekJoon;

import java.util.Scanner;

public class P2448_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) System.out.print(" ");
			if(i%3==1) {
				for(int j=0;j<=i/3;j++) {
					if(j==0||j==i/3)System.out.print("*");
					else System.out.print(" ");
					if(j!=i/3) System.out.print("     ");
				}
			}
			else if(i%3==0) {
				for(int j=0;j<i/3;j++) {
					if(j==0||j==i/3-12)System.out.print("*****");
					else System.out.print("     ");
					if(j!=i/3) System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
