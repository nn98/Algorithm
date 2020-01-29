package BaekJoon;

import java.util.Scanner;

public class P18245 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String t;
		int i=1,j;
		do {
			t=s.next();
			for(j=0;j<t.length();j+=i)System.out.print(t.charAt(j));
			i++;
			System.out.println();
		}while(!t.equals("Was"));
	}

}
