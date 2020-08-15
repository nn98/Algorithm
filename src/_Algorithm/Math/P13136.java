package _Algorithm.Math;

import java.util.Scanner;

public class P13136 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double n=s.nextInt(),m=s.nextInt(),u=s.nextInt();
		System.out.println((long)(Math.ceil(n/u)*Math.ceil(m/u)));
	}

}
