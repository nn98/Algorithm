package _Algorithm;

import java.util.Scanner;

public class JCG_L {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer f=new StringBuffer();
		String a,b="";
		for(;;) {
			a=s.nextLine().trim();
			if(a.equals("")&b.equals(a))continue;
			if(a.equals("00"))break;
			f.append(a+"\n");
			b=a;
		}
		System.out.println(f);
	}

}
