package _Algorithm;

import java.util.Scanner;

public class P14854 {
	static final long P=1000000007l;

	static final int S=4000000;

	static long sol3(long x,long y) {
		long r=1;
		while(y>0) {
			if(y%2!=0) {
				r*=x;
				r%=P;
			}
			x*=x;
			x%=P;
			y/=2;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//		sol 3 
		long fac[]=new long[S+1],x,y,inv[]=new long[S+1];
		fac[1]=1;
		for(int i=2;i<=S;i++)
			fac[i]=(fac[i-1]*i)%P;
		/* 위 코드에서 오류발생 원본 코드는 for(int i=1...
		 * fac[1]에 fac[0]*1%P 하면 당연히 다 0
		 * 코드만든놈 뭐여 불펌자룐가
		 */
		//		for(int i=0;i<20;System.out.print(fac[i++]+" ")); 테스트: for(int i=2로 시작-팩토리얼 성공

		inv[S]=sol3(fac[S],P-2);
		for(int i=S-1;i>=0;i--)
			inv[i]=(inv[i+1]*(i+1))%P;
		//		System.out.println(Arrays.toString(inv));
		for(int n=s.nextInt();n-->0;) {

			x=s.nextLong();
			y=s.nextLong();
			if(x==y||y==0)
				System.out.println(1);
			else {
				long result=(fac[(int) x]*inv[(int) (x-y)])%P;
				result=(result*inv[(int) y])%P;
				System.out.println(result);
			}
		}
	}
}