package BaekJoon;

import java.util.Scanner;

public class P14579 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[]=new int[m-n+1],v=n%2==0?(1+n)*(n/2):(1+n)*(n/2)+(n/2+1);
		System.out.println(v);
	}
}