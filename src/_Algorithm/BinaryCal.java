package _Algorithm;

import java.util.Scanner;

public class BinaryCal {
	//나중에 정리좀
	static StringBuilder sb;
	
	static String sol(String a,String b) {
		int count=0;
		for(;a.charAt(count)=='0';count++) if(count==a.length()-1) break;
		a=a.substring(count);
//		System.out.println("a: "+a);
		count=0;
		for(;b.charAt(count)=='0';count++) if(count==b.length()-1) break;
		b=b.substring(count);
//		System.out.println("b: "+b);
		int al=a.length(),bl=b.length();
		String add="",r="";
		boolean y=false;
		if(al>bl) {
			for(int i=al-bl;i>0;i--) add+="0";
			b=add+b;
			bl=b.length();
		} else if(bl>al) {
			for(int i=bl-al;i>0;i--) add+="0";
			a=add+a;
			al=a.length();
		}
//		System.out.println(a);
//		System.out.println(b);
		for(;al>0&&bl>0;) {
			al--;
			bl--;
			int c=0;
			c+=y?1:0;
			c+=a.charAt(al)=='1'?1:0;
			c+=b.charAt(bl)=='1'?1:0;
//			System.out.println(c);
			switch(c) {
			case 3:
				r+="1";
				break;
			case 2:
				r+="0";
				y=true;
				break;
			case 1:
				r+="1";
				y=false;
				break;
			case 0:
				r+="0";
				break;
			}
		}
		if(y)r+="1";
		sb=new StringBuilder(r);
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next();
		System.out.println(sol(a,b));
	}

}
