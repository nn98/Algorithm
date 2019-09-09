package BaekJoon;

import java.util.Scanner;

public class P10992 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			if(i==n-1) for(int j=0;j<2*n-1;j++) System.out.print("*");
			else {
				for(int j=n-(i+1);j>0;j--) System.out.print(" ");
				if(i!=0) System.out.print("*");
				for(int j=i*2-1;j>0;j--) System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
	}

}