package BaekJoon;

import java.util.Scanner;

public class P16505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==0) System.out.print("*");
		else {
			for(int i=0;i<Math.pow(2,n);i++) {
				if(i%4==0) {
				for(int j=0;j<Math.pow(2,n)-i;j++) {
					System.out.print("*");
				}
				}
				System.out.println();
			}
		}
	}

}
