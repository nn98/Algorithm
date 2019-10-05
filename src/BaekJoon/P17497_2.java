package BaekJoon;

import java.util.Scanner;

public class P17497_2 {

	public static void main(String[] args) {
		long t=new Scanner(System.in).nextLong(),n=2;
		int c=1;
		StringBuilder sb=new StringBuilder("0");
//		System.out.println(t+" "+n);
		while(n*2<t) {
			n*=2;
			c++;
			if(c>99) {
				System.out.println(-1+"\t"+n);
				return;
			}
			sb.append("2");
		}
		if(n*2-t<t-n) {
			n*=2;
			c++;
			if(c>99) {
				System.out.println(-1+"\t"+n);
				return;
			}
			sb.append("2");
		}
//		System.out.println(t+" "+n);
		long d=t-n;
		if(d>0) {
			if(d%2==0) {
				for(int i=0;i<d/2;i++) {
					c++;
					if(c>99) {
						System.out.println(-1+"\t"+n);
						return;
					}
					n+=2;
					sb.append("0");
				}
			}
			else {
				for(int i=0;i<d/2;i++) {
					c++;
					if(c>99) {
						System.out.println(-1);
						return;
					}
					n+=2;
					sb.append("0");
				}
				c+=3;
				if(c>99) {
					System.out.println(-1);
					return;
				}
				n+=1;
				sb.append("203");
			}
		}
		else if(d<0) {
			if(d%2==0) {
				for(int i=0;i<d/-2;i++) {
					c++;
					if(c>99) {
						System.out.println(-1);
						return;
					}
					n-=2;
					sb.append("1");
				}
			}
			else {
				for(int i=0;i<d/-2;i++) {
					c++;
					if(c>99) {
						System.out.println(-1);
						return;
					}
					n-=2;
					sb.append("1");
				}
				c+=3;
				if(c>99) {
					System.out.println(-1);
					return;
				}
				n-=1;
				sb.append("213");
			}
		}
//		System.out.println(t+" "+n);
		System.out.print(sb.length()+"\n[+]");
		for(int i=1;i<sb.length();i++) {
			String o="";
			switch(sb.charAt(i)) {
			case '0':
				o=" [+]";
				break;
			case '1':
				o=" [-]";
				break;
			case '2':
				o=" [*]";
				break;
			case '3':
				o=" [/]";
				break;
			}
			System.out.print(o);
		}
	}
}
