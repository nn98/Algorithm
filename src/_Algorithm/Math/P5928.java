package _Algorithm.Math;

import java.util.Scanner;

public class P5928 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=1440*s.nextInt()+60*s.nextInt()+s.nextInt()-16511;
		System.out.println(n<0?-1:n);
	}
}