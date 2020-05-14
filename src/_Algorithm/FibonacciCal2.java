package _Algorithm;

import java.util.Scanner;

public class FibonacciCal2 {

	static long time;
	
	static long f1(long n) {
		time=System.currentTimeMillis();
		if(n==0)return 0;
		if(n==1)return 1;
		return f1(n-1)+f1(n-2);
	}

	static long h[];
	static long f2(long n) {
		time=System.currentTimeMillis();
		h=new long[(int)n+1];
		h[0]=0;
		h[1]=1;
		for(int i=1;++i<=n;)
			h[i]=h[i-1]+h[i-2];
		return h[(int)n];
	}
	
	static long p[];
	static long f3(long n,int d) {
		time=System.currentTimeMillis();
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
	
	static long mod=1000000007;
	static long f4(long n) {
		time=System.currentTimeMillis();
		long N=n--,m[][]={{1,1},{1,0}},aM[][]={{1,0},{0,1}};
		while(n>0) {
			if(n%2==1)aM=mMultiply(aM,m);
			m=mMultiply(m,m);
			n/=2;
		}
		if(N<3)return 1;
		else return aM[1][0]+aM[1][1]%mod;
	}
	static long[][]mMultiply(long[][]mm1,long[][]mm2){
		int m1=mm1.length,n1=mm1[0].length,m2=mm2.length,n2=mm2[0].length,i=0,j,k;
		long[][]t=new long[m1][n2];
		for(;i<m1;i++)
			for(j=0;j<n2;j++) {
				for(k=0;k<n1;k++)
					t[i][j]+=mm1[i][k]*mm2[k][j];
				t[i][j]%=mod;
			}
		return t;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
//		f1: Recursive 단순 재귀 구현
		
		System.out.println("F1: "+f1(s.nextLong()));
		System.out.println("Runtime: "+(System.currentTimeMillis()-time)+" O(2**n)");
		
//		f2: DP
		
		System.out.println("F2: "+f2(s.nextLong()));
		System.out.println("Runtime: "+(System.currentTimeMillis()-time)+" O(n)");

//		f3: Pisano Period 피사노 주기
		
		System.out.println("F3: "+f3(s.nextLong(),s.nextInt()));
		System.out.println("Runtime: "+(System.currentTimeMillis()-time)+" O(n)");
		
//		f4: Matrix 행렬 연산
		
		System.out.println("F4: "+f4(s.nextLong()));
		System.out.println("Runtime: "+(System.currentTimeMillis()-time)+" O(long2n)");
	}

}
