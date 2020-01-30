package BaekJoon;

import java.util.Scanner;

public class P10798 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a="";
		while(s.hasNext()) {
			a+=s.nextLine()+" ";
			if(a.charAt(a.length()-1)=='0')break;
		}
		String[]b=a.split(" ");
		int i=0,j,c;
		for(;;i++) {
			c=0;
			for(j=0;j<b.length;j++)
				if(i<b[j].length()) {
					System.out.print(b[j].charAt(i));
					c=1;
				}
			if(c==0)break;
		}
//		System.out.println(a);
	}
}
