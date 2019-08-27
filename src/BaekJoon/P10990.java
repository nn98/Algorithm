package BaekJoon;

import java.util.Scanner;

public class P10990 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-(1+i);j>0;j--) System.out.print(" ");
			if(i==0)System.out.print("*");
			else {
				System.out.print("*");
				for(int j=1;j<2*i;j++) System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
