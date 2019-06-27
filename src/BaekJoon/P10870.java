package BaekJoon;

import java.util.Scanner;

public class P10870 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1;
		for(int i=2;i<=n;i++) {
			int t=a+b;
			a=b;
			b=t;
		}
		if(n==0) System.out.println(a);
		else System.out.println(b);
	}
}