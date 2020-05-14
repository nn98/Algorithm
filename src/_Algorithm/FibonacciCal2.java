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
	
	static long p[];
	static long f3(long n,int d) {
		int f0=0,f1=1,f2=1,r=0,i=2;
		for(;i<=n;i++) {
			f2=(f0+f1)%d;
			if(f2%d==1&&f1%d==0) {
				r=i-1;
				break;
			}
			f0=f1;
			f1=f2;
		}
		if(r>0) {
			int N=(int)n%r;
			f0=0;
			f1=1;
			for(i=2;i<=N;i++) {
				f2=(f0+f1)%d;
				f0=f1;
				f1=f2;
			}
		}
		return f2;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
//		f1: Recursive 단순 재귀 구현
		long time=System.currentTimeMillis();
		System.out.println("F1: "+f1(s.nextLong()));
		System.out.println("Runtime: "+(System.currentTimeMillis()-time)+" O(2**n)");
		
//		f2: DP
		time=System.currentTimeMillis();
		System.out.println("F2: "+f2(s.nextLong()));
		System.out.println("Runtime: "+(System.currentTimeMillis()-time)+" O(n)");

//		f3: Pisano Period 피사노 주기
		time=System.currentTimeMillis();
		System.out.print("F3 Mod by: "+f3(s.nextLong(),s.nextInt()));
		System.out.println("Runtime: "+(System.currentTimeMillis()-time));
	}

}
