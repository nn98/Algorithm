package BaekJoon;

import java.util.Scanner;

public class P2444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		/*
		
		for(int i=0;i<N*2-1;i++) {
			for(int j=N-1;j>(i>N-1?(N-i)+(N-2):i);j--) System.out.print(" ");
			for(int k=0;k<=(i>N-1?N*2-(i-N+2)*2:i*2);k++) System.out.print("*");
			System.out.println();
		}
		 */
		for(int i=0;i<N;i++) {
			for(int j=1;j<N-i;j++) System.out.print(" ");
			for(int k=0;k<=i*2;k++) System.out.print("*");
			System.out.println();
		}
		for(int i=2;i<=N;i++) {
			//for(int j=N-1;j>N-i;j--) System.out.print(" ");
			//for(int k=0;k<=(N-i)*2;k++) System.out.print("*");
			//System.out.println();
		}
	}

}
