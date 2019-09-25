package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P1564 {

	static BigInteger N;
	
	static BigInteger p(BigInteger N) {
		if(N.equals(new BigInteger("1"))) return N;
		return N.multiply(p(N).subtract(new BigInteger("1")));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long k=2;
		N=new BigInteger("2");
		for(int i=3;i<=n;i++) {
			k*=i;
			System.out.println(k);
//			if(k%10==0) while(k%10==0) k/=10;
//			System.out.println(k);
			k%=1000000000;
		}
		System.out.println(k%100000);
		//String r=""+p(N);
	}
}