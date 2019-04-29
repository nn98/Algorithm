package BaekJoon;

import java.util.Scanner;

public class P2442 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=0;i<N;i++) {
			for(int j=1;j<N-i;j++) System.out.print(" ");
			for(int k=0;k<=i*2;k++) System.out.print("*");
			System.out.println();
		}
	}

}
