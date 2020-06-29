package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P1377_7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,a[][]=new int[n][2],r=0;
		for(;i<n;a[i][0]=s.nextInt(),a[i][1]=i++);
		Arrays.sort(a,(b,c)->b[0]-c[0]);
		for(i=0;i<n;i++)
			r=Math.max(r,a[i][1]-i);
		System.out.print(r+1);
	}

}
