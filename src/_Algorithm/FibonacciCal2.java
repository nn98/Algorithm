package _Algorithm;

import java.util.Scanner;

public class FibonacciCal2 {

	static long f1(long n) {
		if(n==0)return 0;
		if(n==1)return 1;
		return f1(n-1)+f1(n-2);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
//		f1: Recursive 단순 재귀 구현
		long time=System.currentTimeMillis();
		System.out.print("F1: "+f1(s.nextLong()));
		System.out.println("Runtime: "+(System.currentTimeMillis()-time));
		
//		f2: DP
		time=System.currentTimeMillis();
		System.out.print("F1: "+f1(s.nextLong()));
		System.out.println("Runtime: "+(System.currentTimeMillis()-time));
		
//		f3: 
		time=System.currentTimeMillis();
		System.out.print("F1: "+f1(s.nextLong()));
		System.out.println("Runtime: "+(System.currentTimeMillis()-time));
	}

}
