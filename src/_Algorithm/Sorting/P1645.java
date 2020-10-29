package _Algorithm.Sorting;

import java.util.Scanner;

public class P1645 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),x=10001,a[]=new int[x],i=0;
		while(n-->0)a[s.nextInt()]++;
		while(++i<x)
			if(a[i]>i)break;
		System.out.print(i==x?0:i+1);
	}

}
