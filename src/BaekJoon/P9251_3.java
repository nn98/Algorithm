package BaekJoon;

import java.util.Scanner;

public class P9251_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next(),c="",d="";
		int x=0,y=0;
		for(int i=0;i<a.length();i++) {
			for(int j=x;j<b.length();j++) {
				if(a.charAt(i)==b.charAt(j)) {
					c+=b.charAt(j);
					x=j+1;
					break;
				}
			}
		}
		for(int i=0;i<b.length();i++) {
			for(int j=y;j<a.length();j++) {
				if(b.charAt(i)==a.charAt(j)) {
					d+=a.charAt(j);
					y=j+1;
					break;
				}
			}
		}
//		if(c.length()>d.length()) System.out.print(c);
//		else System.out.print(d);
		System.out.print(c.length()>d.length()?c.length():d.length());
	}
}