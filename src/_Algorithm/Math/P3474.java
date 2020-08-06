package _Algorithm.Math;

import java.util.Scanner;
public class P3474{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a,b,c,d;
		while(n-->0) {
			a=s.nextInt();
			c=0;
			b=d=1;
			while(++b<=a) {
				d*=b;
				c+=d%10==0?1:0;
				d%=10;
			}
			System.out.println(c);
		}
	}
}