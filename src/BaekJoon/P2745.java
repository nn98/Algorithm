package BaekJoon;

import java.util.Scanner;

public class P2745 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.next();
		int b=s.nextInt(),p=1,r=0,l=n.length(),i=0;
		while(l!=0) {
			char t=n.charAt(--l);
			if(t>64)t-=55;
			else t-=48;
			r+=t*p;
			p*=b;
		}
		System.out.println(r);
	}
}