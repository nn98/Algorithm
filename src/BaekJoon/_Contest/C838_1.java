package _Contest;

import java.util.Arrays;
import java.util.Scanner;

public class C838_1 {
	static int n,m,a[],i,j;
	static long r;
//	static void o(int x,int v) {
//		if(++v==m) {
//			r+=n-x;
//			return;
//		}
//		for(int i=x+1;;);
//	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		a=new int[n];
		r=m-1;
		Arrays.sort(a);
		for(i=m;i<n;i++) {
			r+=(m-1)*(m*(i-m+1));
//			System.out.println(r);
		}
		System.out.println(r*2);
//		o(m,0);
	}

}
