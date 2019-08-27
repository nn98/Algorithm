package BaekJoon;

import java.util.Scanner;

public class P15873 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String in=s.next();
		in=in.replaceAll("10", "");
		if(in.length()==0) System.out.println(20);
		else if(in.length()==1) System.out.println("1"+in);
		else if(in.length()==2) System.out.println(Integer.parseInt(in.substring(0, 1))+Integer.parseInt(in.substring(1,2)));
//			System.out.println(())));
	}
}