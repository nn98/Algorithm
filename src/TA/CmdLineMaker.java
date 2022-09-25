package TA;

import java.util.Scanner;

public class CmdLineMaker {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int i=s.nextInt();i-->0;) {
			System.out.println("java -jar "+s.next());
		}
	}

}
