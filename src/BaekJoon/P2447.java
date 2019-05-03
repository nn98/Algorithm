package BaekJoon;

import java.util.Scanner;
	//GG
public class P2447 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),c=3;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) 
				if(i%c==1&&j%c==1) System.out.print(" ");
				else System.out.print("*");
			System.out.println();
		}
	}
}