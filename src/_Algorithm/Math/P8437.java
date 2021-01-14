package _Algorithm.Math;

import java.util.Scanner;

public class P8437 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		if(n%2==0)System.out.print(n/2+m/2+"\n"+(n/2-m/2));
		else System.out.print(n/2+m/2+1+"\n"+(n/2-m/2));
	}

}
