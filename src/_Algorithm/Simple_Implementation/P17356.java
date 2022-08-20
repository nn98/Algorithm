package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P17356 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double a=s.nextInt(),m=1/(1+Math.pow(10,(s.nextInt()-a)/400));
		System.out.print(1/(1+Math.pow(10,(s.nextInt()-a)/400)));
	}

}
