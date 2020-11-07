package _Algorithm.GCD_LCM;

import java.util.Scanner;

public class P10244 {

	static int t;
	static int o(int a,int b) {
		while(b>0) {
			t=a%b;
			a=b;
			b=t;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(o(s.nextInt(),s.nextInt()));
	}

}
