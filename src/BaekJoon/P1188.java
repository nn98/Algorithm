package BaekJoon;

import java.util.Scanner;

public class P1188 {
	static int g(int a,int b) {
		for(;;) {
			int t=a%b;
			if(t==0)return b;
			a=b;
			b=t;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt();
		System.out.print(b-g(a,b));
	}
}