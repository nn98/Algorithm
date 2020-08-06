package _Algorithm.Math;

import java.util.Scanner;

public class P3474_G {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,t,i,f;
		while(n-->0) {
			m=s.nextInt();
			t=f=0;
			for(i=2;i<=m;i*=2)
				t+=m/i;
			for(i=5;i<=m;i*=5)
				f+=m/i;
			System.out.println(f<t?f:t);
		}
		
	}

}
