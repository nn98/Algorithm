package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P4504 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a;
		do {
			a=s.nextInt();
			System.out.print(a>0?String.format("%d is %sa multiple of %d.\n",a,(a%n==0?"":"NOT "),n):"");
		}while(a>0);
	}

}
