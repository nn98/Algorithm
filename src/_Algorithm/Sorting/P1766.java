package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P1766 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1,m=s.nextInt(),a[][]=new int[n][n],c[]=new int[n],r[]=new int[n],i,j;
		for(;m-->0;) {
			i=s.nextInt();
			j=s.nextInt();
			a[j][i]++;
			c[j]++;
		}
		System.out.println(Arrays.toString(c));
		for(int[]b:a)System.out.println(Arrays.toString(b));
	}

}
