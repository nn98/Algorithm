package _Algorithm.Math;

import java.util.Scanner;

public class P8437 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		if(n%2==0)System.out.println(n/2+m/2+" "+(n/2-m/2));
	}

}
