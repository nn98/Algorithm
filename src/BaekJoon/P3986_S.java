package BaekJoon;

import java.util.Scanner;
public class P3986_S {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),r=0;
		while(n-->0) {
			String t=s.next();
			while(t.contains("AA")||t.contains("BB")) {
				t=t.replace("AA","");
				t=t.replace("BB","");
			}
			if(t.equals(""))r++;
		}
		System.out.print(r);
	}
}