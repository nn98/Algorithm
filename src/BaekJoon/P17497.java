package BaekJoon;

import java.util.Scanner;

public class P17497 {

	public static void main(String[] args) {
		long t=new Scanner(System.in).nextInt(),n=2;
		StringBuilder sb=new StringBuilder("[+]");
//		System.out.println(t+" "+n);
		while(n*2<t) {
			n*=2;
			sb.append(" [*]");
		}
		if(n*2-t<t-n) {
			n*=2;
			sb.append(" [*]");
		}
//		System.out.println(t+" "+n);
		long d=t-n;
		if(d>0) {
			if(d%2==0) {
				for(int i=0;i<d/2;i++) {
					n+=2;
					sb.append(" [+]");
				}
			}
			else {
				for(int i=0;i<d/2;i++) {
					n+=2;
					sb.append(" [+]");
				}
				n+=1;
				sb.append(" [*] [+] [/]");
			}
		}
		else if(d<0) {
			if(d%2==0) {
				for(int i=0;i<d/-2;i++) {
					n-=2;
					sb.append(" [-]");
				}
			}
			else {
				for(int i=0;i<d/-2;i++) {
					n-=2;
					sb.append(" [-]");
				}
				n-=1;
				sb.append(" [*] [-] [/]");
			}
		}
//		System.out.println(t+" "+n);
		System.out.println((sb.length()-3)/4+1);
		System.out.println(sb.toString());
	}

}
