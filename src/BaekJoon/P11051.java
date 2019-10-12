package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;
class P11051 {
	public static void main(String[]Z) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),m=n-k;
		if(k==0||m==0) {
			System.out.println(1);
			return;
		}
		if(m>k) {
			int t=m;
			m=k;
			k=t;
		}
		BigInteger a=new BigInteger(""+n);
//		System.out.println(n+" "+k+" "+m);
		for(;--n>k;)a=a.multiply(new BigInteger(""+n));
//		System.out.println(a);
		for(;m>1;m--)a=a.divide(new BigInteger(""+m));
		System.out.println(a);
		System.out.print(a.mod(new BigInteger("10007")));
	}
}