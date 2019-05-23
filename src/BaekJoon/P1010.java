package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P1010 {

	static BigInteger sol(int n,int m) {
		BigInteger sum=new BigInteger("1");
		int temp=n;
		while(n>0) {
			sum=sum.multiply(BigInteger.valueOf(m));
			--n;
			--m;
		}
		while(temp>0) {
			sum=sum.divide(BigInteger.valueOf(temp));
			--temp;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=0;i<N;i++) {
			int n=s.nextInt(),m=s.nextInt(),c=0;
			System.out.println(sol(n,m));
		}
	}

}
