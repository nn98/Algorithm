package _Algorithm.BackTracking;

import java.util.Scanner;

public class BackTracking {

	static int n,m,a[],b[];
	static char[]r;
	static boolean[]c;
	
	// 중복 가능한 모든 조합
	static void o1(int x) {
		if(x==m)
			System.out.println(r);
		else
			for(int i=0;i++<n;) {
				r[x]=(char) (i+'0');
				o1(x+1);
			}
	}

	static void o2(int x) {
		if(x==m)
			System.out.println(r);
		else
			for(int i=0;i++<n;) {
				if(c[i])continue;
				r[x]=(char) (i+'0');
				c[i]=true;
				o2(x+1);
				c[i]=false;
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
		o1(0);
		c=new boolean[n+1];
		o2(0);
	}
}