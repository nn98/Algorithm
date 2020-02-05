package BaekJoon;

import java.util.Scanner;
public class P5582_2 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next();
		int i=0,j,c[][]=new int[4005][4005],r=0;
		for(;i<a.length();i++)
			for(j=0;j<b.length();j++)
				if(a.charAt(i)==b.charAt(j)) {
					c[i+1][j+1]=c[i][j]+1;
					r=Math.max(r,c[i+1][j+1]);
				}
		System.out.print(r);
	}
}