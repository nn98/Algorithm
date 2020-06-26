package _Algorithm.Sorting;

import java.util.Scanner;

public class P1377 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1,i=0,j,k=1,a[]=new int[n];
		for(;++i<n;a[i]=s.nextInt());
		for(i=1;++i<n;k+=a[i-1]>a[i]?1:0);
		System.out.println(k);
	}
// 같은값은?
}
