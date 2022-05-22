package Baekjoon;

import java.util.Scanner;

public class Q11721 {
	static Scanner s=new Scanner(System.in);
	public static void main(String args[]) {
		String st=s.next();
		for(int i=0;i<st.length();i++) {
			if(i==0);
			else if(i%10==0) System.out.println();
			System.out.print(st.charAt(i));
		}
	}
}
