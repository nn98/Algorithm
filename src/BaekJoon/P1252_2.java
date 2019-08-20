package BaekJoon;

import java.util.Scanner;

public class P1252_2 {
	
	static boolean flag=false;
	
	static String sol(char a,char b) {
		if(flag) {
			if(a=='0') {
				if(b=='0') {
					flag=false;
					return "1";
				}
				if(b=='1') {
					return "0";
				}
			}
			else if (a=='1') {
				if(b=='0') {
					return "0";
				}
				if(b=='1') {
					return "1";
				}
			}
		}
		else {
			if(a=='0') {
				if(b=='0') {
					return "0";
				}
				if(b=='1') {
					return "1";
				}
			}
			else if (a=='1') {
				if(b=='0') {
					return "1";
				}
				if(b=='1') {
					flag=true;
					return "0";
				}
			}
		}
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		String a=s.next(),b=s.next(),r="";
		StringBuilder sb=new StringBuilder(a);
		a=sb.reverse().toString();
		sb=new StringBuilder(b);
		b=sb.reverse().toString();
//		System.out.println("a: "+a+" b: "+b);
		int size=a.length()>b.length()?a.length():b.length();
		for(int i=0;i<size;i++) {
			if(i>=a.length()) {
				r+=sol('0',b.charAt(i));
				continue;
			}
			if(i>=b.length()) {
				r+=sol(a.charAt(i),'0');
				continue;
			}
			r+=sol(a.charAt(i),b.charAt(i));
		}
		if(flag) r+="1";
		sb=new StringBuilder(r);
		r=sb.reverse().toString();
		int t=0,l=0;
		for(int i=0;i<r.length();i++) {
			if(r.charAt(i)=='1') break;
			if(r.charAt(i)=='0') t++;
		}
		if(t<r.length())
			r=r.substring(t);
		System.out.println(r);
	}
}