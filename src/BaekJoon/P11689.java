package BaekJoon;

import java.util.Scanner;

//https://lanph3re.github.io/backjoon1689
public class P11689 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong(),c=-1,r=n,t,k=2,i=2;
		if(n==1) {
			System.out.print(1);
			return;
		}
		t=(long) Math.sqrt(n);
		for(;i<=t;i++)while(n%i==0) {
			n/=i;
			if(c!=i) {
				c=i;
				r/=i;
				r*=(i-1);
			}
		}
		if(n>1) {
			r/=n;
			r*=(n-1);
		}
		System.out.print(r);
	}
}