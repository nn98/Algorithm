package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,j,m;
		for(;i<n;a[i++]=s.nextInt());
		System.out.println(Arrays.toString(a));
		for(i=0;i<n-1;i++)
			for(j=i+1;j<n;j++)
				if(a[j-1]>a[j]) {
					m=a[j];
					a[j]=a[j-1];
					a[j-1]=m;
				}
		System.out.println(Arrays.toString(a));
	}

}
