package BaekJoon;

import java.util.Scanner;

public class P1003 {

	static int z=1,o=0;
	/*
	static void f(int n) {
		if(n==0) z++;
		//System.out.println("0");

		else if(n==1) o++;
		//System.out.println("1");
		else {
			f(n-1);
			f(n-2);
		}
	}
	 */
	
	static void f(int n) {
		for(int i=1;i<=n;i++) {
			int t=z+o;
			z=o;
			o=t;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=0;i<N;i++) {
			z=1;
			o=0;
			f(s.nextInt());
			System.out.println(""+z+" "+o);
		}
	}

}
