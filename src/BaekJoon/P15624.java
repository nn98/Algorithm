package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P15624 {

	static BigInteger a=new BigInteger("0"),b=new BigInteger("1");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		for(int i=2;i<=n;i++) {
			BigInteger t=a.add(b).mod(new BigInteger("1000000007"));
			a=b;
			b=t;
		}
		if(n==0) System.out.println(a);
		else System.out.println(b);
	}
}