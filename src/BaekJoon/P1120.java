package BaekJoon;

import java.util.Scanner;

public class P1120 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next();
		int m=0,p=b.length()-a.length();
		for(int i=0;i<=p;i++) {
			int u=0;
			for(int j=0;j<a.length();j++)if(a.charAt(j)==b.charAt(j+i))u++;
			m=m>u?m:u;
		}
		System.out.print(b.length()-(p+m));
	}

}
