package BaekJoon;

import java.util.Scanner;

public class P1564_5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong(),m=1,r=1;
		while(m++<n) {
			r*=m;
			while(r%10==0)r/=10;
		}
		String R=""+r;
		System.out.println(R.substring(R.length()-5,R.length()));
	}

}
