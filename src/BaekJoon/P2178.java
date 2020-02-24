package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2178 {

	static int x,y,a[][],i=0,j,r=99999;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		a=new int[x+1][y+1];
		for(;i++<x;) {
			j=1;
			for(char k:s.next().toCharArray())
				a[i][j++]=k;
		}
		for(int[]k:a)
			System.out.println(Arrays.toString(k));
	}

}
