package BaekJoon;

import java.util.Scanner;

class P13225_S {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,v,c;
		for(;n-->0;) {
			v=s.nextInt();
			c=0;
			for(i=0;i++<v;)if(v%i==0)c++;
			System.out.println(v+" "+c);
		}
	}
}