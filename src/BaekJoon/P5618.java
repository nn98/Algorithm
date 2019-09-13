package BaekJoon;

import java.util.Scanner;

public class P5618 {

	static int sol(int a,int b) {
		int t=-1;
		if(b<a) {
			t=a;
			a=b;
			b=t;
		}
		while(!(b%a==0)) {
			t=b%a;
			b=a;
			a=t;
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a=s.nextInt(),b=0;
		for(int i=1;i<n;i++) {
			b=s.nextInt();
			a=sol(a,b);
		}
//		System.out.println(a);
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.println(i);
			}
		}
	}
}