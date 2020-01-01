package BaekJoon;

import java.util.Scanner;

public class P11098 {
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		for(int n=s.nextInt();n-->0;) {
			int i=0;
			String t="";
			for(int m=s.nextInt();m-->0;) {
				int j=s.nextInt();
				String f=s.next();
				if(j>i) {
					i=j;
					t=f;
				}
			}
			System.out.println(t);
		}
	}
}