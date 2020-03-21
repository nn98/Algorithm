package BaekJoon;

import java.util.Scanner;

public class P4493 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,i,a,b;
		for(;n-->0;) {
			a=b=0;
			for(m=s.nextInt();m-->0;) {
				String A=s.next(),B=s.next();
				switch(A) {
				case "R":
					switch(B) {
					case "R":
						break;
					case "P":
						b++;
						break;
					case "S":
						a++;
						break;
					}
					break;
				case "P":
					switch(B) {
					case "R":
						a++;
						break;
					case "P":
						break;
					case "S":
						b++;
						break;
					}
					break;
				case "S":
					switch(B) {
					case "R":
						b++;
						break;
					case "P":
						a++;
						break;
					case "S":
						break;
					}
					break;
				}
				System.out.println(a==b?"TIE":"Player "+(a<b?2:1));
			}
		}
	}

}
