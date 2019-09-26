package insert;

import java.util.Scanner;

public class P2789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] regex="CAMBRIDGE".split("");
		String in=s.next();
		for(String i:regex) in=in.replaceAll(i, "");
		System.out.println(in);
	}

}
