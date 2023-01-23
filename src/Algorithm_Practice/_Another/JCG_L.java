package Algorithm_Practice._Another;

import java.util.Scanner;

public class JCG_L {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer f=new StringBuffer();
		String a,b="";
		for(;;) {
			a=s.nextLine().trim();
			if(a.equals(""))continue;
			if(a.equals("00"))break;
			f.append(a+"\n");
			b=a;
		}
		System.out.println(f);
	}

}
