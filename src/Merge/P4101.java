package Merge;

import java.util.Scanner;

public class P4101 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		while(0!=(a=s.nextInt())&&0!=(b=s.nextInt())) {
			System.out.println(a>b?"Yes":"No");
		}
	}
}