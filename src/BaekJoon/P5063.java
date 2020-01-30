package BaekJoon;

import java.util.Scanner;
public class P5063 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a="advertise",b="does not matter",c="do not "+a;
		int n=s.nextInt(),m;
		for(;n-->0;) {
			m=s.nextInt()-s.nextInt()+s.nextInt();
			System.out.println(m==0?b:m<0?a:c);
		}
	}
}