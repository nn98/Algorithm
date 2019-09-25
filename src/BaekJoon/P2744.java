package BaekJoon;

import java.util.Scanner;

public class P2744 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String in=s.nextLine(),r="";
		for(int i=0;i<in.length();i++) {
			if(in.charAt(i)>='a') r+=(char)(in.charAt(i)-32);
			else r+=(char)(in.charAt(i)+32);
		}
		System.out.println(r);
	}
}
