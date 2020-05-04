package BaekJoon;

import java.util.Scanner;

public class P2476 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a,b,c,m=0,v=0;
		for(;n-->0;) {
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			if(a==b||b==c||a==c) {
				if(a==b&&b==c)v=10000+a*1000;
				else if(a==b||a==c)v=1000+a*100;
				else if(b==c)v=1000+b*100;
			}
			else v=Math.max(a, Math.max(c, b))*100;
			m=m>v?m:v;
		}
		System.out.println(m);
	}

}
