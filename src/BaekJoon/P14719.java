package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P14719 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt(),y=s.nextInt(),i=0,j,v=0,r=0;
		boolean c=false,a[][]=new boolean[x][y];
		for(;i<y;i++)for(j=s.nextInt();j-->0;a[j][i]=true);
		for(boolean[]b:a)System.out.println(Arrays.toString(b));
		for(i=0;i<x;i++) {
			c=false;
			v=0;
			for(j=0;j<y;j++) {
				if(a[i][j]) {
					if(c) {
						j--;
						c=false;
						r+=v;
					}else {
						c=true;
						v=0;
					}
				}else {
					if(c)v++;
				}
			}
		}
		System.out.print(r);
	}

}
