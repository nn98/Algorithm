package BaekJoon;

import java.util.Scanner;
public class P5555 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next(),b;
		int i=s.nextInt(),r=0;
		for(;i-->0;) {
			b=s.next();
			b=b+b;
			if(b.contains(a))r++;
		}
		System.out.print(r);
	}
}