package BaekJoon.Math;

import java.util.Scanner;

public class P15700 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		System.out.println(n*(m/2)+m%2*(n/2));
	}

}
