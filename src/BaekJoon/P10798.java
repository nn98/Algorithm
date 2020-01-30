package BaekJoon;

import java.util.Scanner;

public class P10798 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a="";
		while(s.hasNext()) {
			a+=s.nextLine();
			if(a.charAt(a.length()-1)=='0')break;
		}
		System.out.println(a);
	}
}
