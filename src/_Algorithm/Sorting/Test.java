package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	static int n,a[][],i;
	static void w(int i,int j) {
		int[]t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n][2];
		for(;i<n;a[i][0]=s.nextInt(),a[i++][1]=i);
		for(int[]b:a)System.out.println(Arrays.toString(b));
		w(1,4);
		System.out.println();
		for(int[]b:a)System.out.println(Arrays.toString(b));
	}

}
