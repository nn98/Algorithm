package _Algorithm;

import java.util.Scanner;

public class FibonacciCal2 {

	static long f1(long n) {
		if(n==0)return 0;
		if(n==1)return 1;
		return f1(n-1)+f1(n-2);
	}

	static long h[];
	static long f2(long n) {
		h=new long[(int)n+1];
		h[0]=0;
		h[1]=1;
		for(int i=1;++i<=n;)
			h[i]=h[i-1]+h[i-2];
		return h[(int)n];
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
//		f1: Recursive 단순 재귀 구현
		long time=System.currentTimeMillis();
		System.out.println("F1: "+f1(s.nextLong()));
		System.out.println("Runtime: "+(System.currentTimeMillis()-time));
		
//		f2: DP
		time=System.currentTimeMillis();
		System.out.println("F2: "+f2(s.nextLong()));
		System.out.println("Runtime: "+(System.currentTimeMillis()-time));
		
	}

}
