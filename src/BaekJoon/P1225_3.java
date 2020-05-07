package BaekJoon;

import java.util.Scanner;

public class P1225_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		long b=0,m=a.indexOf(" "),c=0;
		int n=-1;
		for(;++n<a.length();) {
			if(n<m)b+=a.charAt(n)-48;
			if(n>m)c+=a.charAt(n)-48;
		}
		System.out.println(b*c);
	}

}
