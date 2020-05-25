package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,j,m;
		for(;i<n;a[i++]=s.nextInt());
		System.out.println(Arrays.toString(a));
		
//		1. Def bubble
//		for(i=0;i<n;i++)
//			for(j=1;j<n-i;j++)
//				if(a[j-1]>a[j]) {
//					m=a[j];
//					a[j]=a[j-1];
//					a[j-1]=m;
//				}
		
//		2. Adv bubble
		boolean c=true;
		for(i=0;i<n&&c;i++) {
			c=false;
			for(j=1;j<n-i;j++)
				if(a[j-1]>a[j]) {
					c=true;
					m=a[j];
					a[j]=a[j-1];
					a[j-1]=m;
				}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(i);
	}

}
