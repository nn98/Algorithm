package _Algorithm.String;

import java.util.Scanner;

public class P9086 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		String a;
		for(;n-->0;a=s.next(),System.out.println((char)a.charAt(0)+(char)a.charAt(a.length()-1)));
	}

}
