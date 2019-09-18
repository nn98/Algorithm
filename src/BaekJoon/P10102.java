package BaekJoon;

import java.util.Scanner;

public class P10102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=0,b=0;
		s.nextLine();
		String in=s.nextLine();
		for(int i=0;i<in.length();i++) {
			if(in.charAt(i)=='A') a++;
			if(in.charAt(i)=='B') b++;
		}
		if(a==b) System.out.print("Tie");
		else if(a>b) System.out.print("A");
		else if(a<b) System.out.print("B");
	}
}
