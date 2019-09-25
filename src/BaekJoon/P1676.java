package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		BigInteger N=new BigInteger("2");
		for(int i=3;i<=n;i++) {
			N=N.multiply(new BigInteger(""+i));
		}
		String r=N.toString();
		for(n=r.length()-1;r.charAt(n)=='0';n--);
		System.out.println(r.length()-1-n);
	}

}
