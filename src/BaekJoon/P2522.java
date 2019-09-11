package BaekJoon;

import java.util.Scanner;

public class P2522 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n*2-1;i++) {
			for(int j=Math.abs(n-i);j>0;j--) System.out.print(" ");
			for(int j=i>n?(n-(i-n)):i;j>0;j--) System.out.print("*");
			System.out.println();
		}
	}
}