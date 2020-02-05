package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P9252 {
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next(),r="";
		int i=0,j=0,c[][]=new int[1001][1001],x,y;
		for(;++i<=a.length();)for(j=0;++j<=b.length();)c[i][j]=a.charAt(i-1)==b.charAt(j-1)?c[i-1][j-1]+1:Math.max(c[i-1][j],c[i][j-1]);
		StringBuffer f=new StringBuffer();
		x=--i;
		y=--j;
		System.out.print(c[i][j]);
	}
}