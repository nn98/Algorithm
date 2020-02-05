package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P5582 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next();
		int i=1,j=1,c[][]=new int[4001][4001],v=0,x,y,p;
		for(;i<=a.length();i++)
			for(j=1;j<=b.length();j++)
				c[i][j]=a.charAt(i-1)==b.charAt(j-1)?c[i-1][j-1]+1:Math.max(c[i-1][j],c[i][j-1]);
		for(i=1;i<=a.length();i++)
			for(j=1;j<b.length();j++) {
				p=0;
				x=i;
				y=j;
				while(c[x][y]==c[x-1][y-1]+1) {
					p++;
					x++;
					y++;
				}
				v=v>p?v:p;
			}
//		for(int[]o:c)System.out.println(Arrays.toString(o));
		System.out.print(v);
	}
}
