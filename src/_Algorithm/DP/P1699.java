package _Algorithm.DP;

import java.util.Arrays;

public class P1699 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=0,j=1,x=316,a[]=new int[x];
		for(;i<x;a[i++]=j*j++);
		j=0;
//		System.out.println(Arrays.toString(a));
		for(i=x;i-->0;) {
			if(n>=a[i]) {
				n-=a[i++];
				j++;
			}
		}
	}

}