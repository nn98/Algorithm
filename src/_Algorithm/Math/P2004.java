package _Algorithm.Math;

import java.util.Scanner;

public class P2004 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),f=0,i,b=n-m;
		if(b>m) {
			i=b;
			b=m;
			m=i;
		}
		for(;m++<n;) {
			i=m;
			while(i%5==0) {
				i/=5;
				f++;
			}
		}
		for(;b>4;b--) {
			i=b;
			while(i%5==0) {
				i/=5;
				f--;
			}
		}
		System.out.println(f);
	}

}
