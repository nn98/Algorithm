package BaekJoon;

import java.util.Scanner;

public class P1929 {

	/*
	static int sol(int n) {
		if(n==1) return 0;
		for(int i=2;i<n;i++) {
			if(n%i==0) return 0;
		}
		return 1;
	}
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		for(int i=n;i<=m;i++) {
			/* 
			boolean x=true;
			//if(sol(i)==1) System.out.println(i);
			for(int j=2;j<i;j++) {
				if(i%j==0) x=false;
			}
			if(x)
				System.out.println(i);
			 */
			if(i<4) System.out.println(i);
			else if(i%2==0||i%3==0) continue;
			else System.out.println(i);
		}
	}

}
