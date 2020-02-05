package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P9252 {
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next(),r="";
		int i=0,j=0,c[][]=new int[1001][1001],x,y;
		for(;++i<=a.length();)for(j=0;++j<=b.length();)c[i][j]=a.charAt(i-1)==b.charAt(j-1)?c[i-1][j-1]+1:Math.max(c[i-1][j],c[i][j-1]);
		x=--i;
		y=--j;
		while(c[x][y]!=0) {
			if(c[x][y]==c[x][y-1])y--;
			else if(c[x][y]==c[x-1][y])x--;
			else if(c[x][y]-1==c[x-1][y-1]) {
				r+=a.charAt(--x);
				y--;
			}
		}
		System.out.print(c[i][j]+"\n"+new StringBuffer(r).reverse());
	}
}