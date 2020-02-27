package BaekJoon;

import java.util.Scanner;

public class P1264 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String in;
		int i=0,r=0,a[]=new int[26];
		while(!"#".equals(in=s.nextLine())) {
			for(;i<in.length();a[in.charAt(i++)-'a']++);
		}
	}

}
