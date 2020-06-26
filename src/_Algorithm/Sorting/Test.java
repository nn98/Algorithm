package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[][]=new int[n][2],i=0;
		for(;i<n;a[i][0]=s.nextInt(),a[i++][1]=i+1);
		for(int[]b:a)System.out.println(Arrays.toString(b));
		Arrays.sort(a);
		for(int[]b:a)System.out.println(Arrays.toString(b));
	}

}
