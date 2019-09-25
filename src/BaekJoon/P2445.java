package BaekJoon;

import java.util.Scanner;

public class P2445 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=1;i<N*2;i++) {
			for(int j=N;j>Math.abs(N-i);j--) System.out.print("*");
			for(int j=0;j<Math.abs(N-i)*2;j++) System.out.print(" ");
			for(int j=N;j>Math.abs(N-i);j--) System.out.print("*");
			System.out.println();
		}
	}

}
