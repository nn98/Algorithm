package BaekJoon;

import java.util.Scanner;

public class P10798_S {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[]b=new String[15];
		int i=0,j,c;
		while(s.hasNext())b[i++]=s.next();
		for(i=0;;i++) {
			c=0;
			for(j=0;j<b.length&&b[j]!=null;j++)
				if(i<b[j].length()) {
					System.out.print(b[j].charAt(i));
					c=1;
				}
			if(c==0)break;
		}
	}
}