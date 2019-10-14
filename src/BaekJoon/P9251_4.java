package BaekJoon;

import java.util.Scanner;

public class P9251_4 {
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine(),b=s.nextLine(),r;
		if(a.length()>b.length()) {
			r=a;
			a=b;
			b=r;
		}
		int f=0,q=0,p=0;
		for(int i=0;i<a.length();i++) {
			for(int j=f;j<b.length();j++) {
				if(a.charAt(i)==b.charAt(j)) {
					f=j+1;
					q++;
					break;
				}
			}
		}
		f=0;
		for(int i=0;i<b.length();i++) {
			for(int j=f;j<a.length();j++) {
				if(b.charAt(i)==a.charAt(j)) {
					f=j+1;
					p++;
					break;
				}
			}
		}
		System.out.println(q+" "+p);
		System.out.print(q>p?q:p);
	}
}