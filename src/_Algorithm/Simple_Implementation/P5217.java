package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P5217 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,j;
		for(;n-->0;) {
			i=s.nextInt();
			System.out.print("Pairs for "+i+":");
			for(j=1;j<i/2;j++) {
				if(i-j!=j)System.out.print(" "+j+" "+(i-j));
			}
			System.out.println();
		}
	}

}
