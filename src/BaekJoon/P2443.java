package BaekJoon;

import java.util.Scanner;

public class P2443 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=1;i<=N;i++) {
			for(int j=N-1;j>N-i;j--) System.out.print(" ");
			for(int k=0;k<=(N-i)*2;k++) System.out.print("*");
			System.out.println();
		}
	}

}
