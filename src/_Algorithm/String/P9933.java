package _Algorithm.String;

import java.util.Scanner;

public class P9933 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j;
		s.nextLine();
		StringBuffer[]a=new StringBuffer[n];
		while(n-->0) {
			a[i++]=new StringBuffer(s.nextLine());
		}
	}

}
