package _Algorithm;

import java.util.Scanner;

public class BackTracking {

	static int n,m,a[],b[];
	static char[]r;
	static boolean[]c;
	
	static void o(int x,int l) {
		if(x==m)
			System.out.println(r);
		else
			for(int i=0;i<n;i++) {
				r[x]=(char) (i+'0');
				o(x+1,0);
			}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("count of Integer: ");
		n=s.nextInt();
		a=new int[n];
		System.out.print("count of Set: ");
		m=s.nextInt();
		b=new int[m];
		r=new char[m];
		o(0,0);
	}
}