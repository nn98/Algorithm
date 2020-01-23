package BaekJoon;

import java.util.Scanner;

public class P3449 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),r,i;
		for(;n-->0;) {
			String a=s.next(),b=s.next();
			r=i=0;
			for(;i<a.length();i++){
				r+=a.charAt(i)==b.charAt(i)?1:0;
			}
		}
	}

}
