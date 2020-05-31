package _Algorithm.Sorting;

import java.util.Scanner;

public class Heap {
	
	static int n,S=2,l,r,a[];
	static void h(int x) {
		l=x*2+1;
		r=x*2+2;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(S-1<n)S*=2;
		System.out.println(--S);
		a=new int[S];
	}
}