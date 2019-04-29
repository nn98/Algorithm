package BaekJoon;

import java.util.Scanner;

public class P2446 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=1;i<N*2;i++) {
			for(int j=Math.abs(N-i)+1;j<N;j++) System.out.print(" ");
			for(int k=Math.abs(N-i)*2;k>=0;k--) System.out.print("*");
			System.out.println();
		}
		
	}
}
