package BaekJoon;

import java.util.Scanner;

public class P10997 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==1) System.out.println("*");
		else {
			for(int i=0;i<n*4;i++) {
				if(i==0||i==n*4-1) for(int j=0;j<(n-1)*5-(n-2);j++) System.out.print("*");
				else {
					System.out.print("");
				}
				System.out.println();
			}
		}
	}

}
