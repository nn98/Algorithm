package BaekJoon;

import java.math.BigInteger;

public class P18222_2{
	public static void main(String[] args){
		long a=1,n=new java.util.Scanner(System.in).nextLong(),c=0;
		for(;a<n;a*=2);
		for(;n>0;c+=n/a,n%=a,a/=2);
		System.out.println(n==1?0:c%2);
	}
}