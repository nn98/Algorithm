package BaekJoon;

import java.util.Scanner;

public class P1564_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long n=s.nextLong(),sum=1;
		for(long i=n;i>0;i--) {
			sum*=i;
			while(sum%10==0) sum/=10;
			sum%=100000000;
		}
		sum%=100000;
		System.out.printf("%05d",sum);
	}
}