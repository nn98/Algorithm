package _Algorithm.Sorting;

import java.util.Scanner;

public class P7578_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],b[],z,A[]=new int[1000001],i=0,j,r=0;
		for(;i<n;a[i]=s.nextInt(),A[a[i]]=i++);
		for(i=0;i<n;a[i++]=s.nextInt());
		for(i=0;++i<n;) {
			z=A[a[i]];
			for(j=0;j<i;j++)
				if(A[a[j]]>z)r++;
		}
		System.out.print(r);
	}

}
