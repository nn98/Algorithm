package Algorithm_Practice;

import java.util.Scanner;

public class GCDLCM {

	static int GCD(int a,int b) {
		while(b!=0) {
			int c=a%b;
			a=b;
			b=c;
		}
		return a;
	}
	static int LCM(int a,int b) {
		return a*b/GCD(a,b);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt();
		System.out.println(GCD(a,b));
		System.out.println(LCM(a,b));
	}

}
