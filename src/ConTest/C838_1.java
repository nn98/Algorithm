package ConTest;

import java.util.Arrays;
import java.util.Scanner;

public class C838_1 {
	static int n,m,a[],i,j;
	static long r;
	static void o(int x,int v) {
		if(++v==m) {
			r+=n-x;
			return;
		}
		for(int i=x+1;;);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		a=new int[n];
		Arrays.sort(a);
		o(0,0);
	}

}
