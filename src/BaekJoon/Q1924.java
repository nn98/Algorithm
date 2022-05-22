package Baekjoon;

import java.util.Scanner;

public class Q1924 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=s.nextInt();
		int y=s.nextInt();
		int d=y;
		int[] m={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31};
		for(int i=1;i<x;i++) d+=m[i-1];
		d%=7;
		if(d==0) System.out.print("SUN");
			
		if(d==1) System.out.print("MON");
			
		if(d==2) System.out.print("TUE");
		
		if(d==3) System.out.print("WED");
		
		if(d==4) System.out.print("THU");
			
		if(d==5) System.out.print("FRI");
			
		if(d==6) System.out.print("SAT");
	}

}
