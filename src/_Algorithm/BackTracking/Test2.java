package _Algorithm.BackTracking;

import java.util.Scanner;

public class Test2 {

	static int n,m,a[],i;
	static char[]b;
	static void o() {
		if(i==m)
			System.out.println(b);
		else 
			for(int j=0;++j<n;) {
				if(true) {
					a[j]++;
					b[i++]=(char)(j+'0');
					o();
					i--;
					a[j]--;
				}
			}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		m=s.nextInt();
		a=new int[n];
		b=new char[m];
		o();
	}

}
