package _Algorithm.BackTracking;

import java.util.Scanner;

public class Test1 {

	static int n,m,b[],j;
	static char[]a;
	static void o(int x) {
		if(x<m)
			for(int i=0;i++<n;) {
				a[x]=(char) ('0'+i);
				o(x+1);
			}
		else System.out.println(a);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		b=new int[n];
		o(0);
	}

}
