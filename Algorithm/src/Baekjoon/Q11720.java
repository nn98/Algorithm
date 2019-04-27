package Baekjoon;

import java.util.Scanner;

public class Q11720 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=s.nextInt();
		int sum=0;
		String t=s.next();
		for(int i=0;i<t.length();i++) sum+=t.charAt(i)-'0';
		System.out.println(sum);
	}

}
