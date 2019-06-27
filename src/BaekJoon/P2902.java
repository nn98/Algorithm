package BaekJoon;

import java.util.Scanner;

public class P2902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String r="";
		for(String i:s.next().split("-")) r+=i.charAt(0);
		System.out.println(r);
	}

}
