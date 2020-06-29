package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P1838 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,b[]=new int[n];
		for(;i<n;b[i]=a[i++]=s.nextInt());
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
