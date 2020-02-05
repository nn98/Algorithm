package BaekJoon;

import java.util.Scanner;

public class P1958 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next(),d=s.next();
		int i=1,j=1,o=1,c[][][]=new int[101][101][101];
		for(;i<=a.length();i++)
			for(j=1;j<=b.length();j++)
				for(o=1;o<=d.length();o++)
				c[i][j][o]=a.charAt(i-1)==b.charAt(j-1)&&b.charAt(j-1)==d.charAt(o-1)?c[i-1][j-1][o-1]+1:Math.max(c[i-1][j][o],Math.max(c[i][j-1][o],c[i][j][o-1]));
		System.out.print(c[i-1][j-1][o-1]);
	}
}