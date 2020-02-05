package BaekJoon;

import java.util.Scanner;

public class P9252 {
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next(),r="";
		int i=1,j=1,c[][]=new int[1001][1001],v=0;
//		r+=d?a.charAt(i-1):"",
		for(;i<=a.length();i++)
			for(j=1;j<=b.length();r+=c[i][j]>v?a.charAt(i-1):"",v=v>c[i][j]?v:c[i][j],j++)
				c[i][j]=a.charAt(i-1)==b.charAt(j-1)?c[i-1][j-1]+1:Math.max(c[i-1][j],c[i][j-1]);
		System.out.println(c[i-1][j-1]);
		System.out.println(r);
	}
}