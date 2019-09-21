package BaekJoon;

import java.util.Scanner;

public class P2504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in=new Scanner(System.in).next();
		int o=0,c=0;
		for(int i=0;i<in.length();i++) {
			if(in.charAt(i)=='(') o++;
			if(in.charAt(i)==')') o--;
			if(in.charAt(i)=='[') c++;
			if(in.charAt(i)==']') c--;
			if(o<0||c<0) break;
		}
		if(o!=0||c!=0) System.out.print(0);
		else {
			System.out.println(in.indexOf(")"));
//			in=in.replaceAll("()", "2");
//			System.out.print(in);
//			in=in.replaceAll("[]", "3");
//			System.out.print(in);
		}
	}

}
