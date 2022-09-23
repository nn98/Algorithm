package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P10419 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,j;
		for(;n-->0;) {
			i=s.nextInt();
			for(j=0;;) {
				if(++j*j+j>i) {
					System.out.println(j-1);
					break;
				}
			}
		}
	}

}
