package _Algorithm.Math;

import java.util.Scanner;

public class P1059 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[1000],i,j;
		while(n-->0)a[s.nextInt()]++;
		i=j=n=s.nextInt();
		for(;!(a[i]>0&a[j]>0);i--,j++) {
			if(a[i]>0)i++;
			if(a[j]>0)j--;
		}
		System.out.print(i+" "+j);
	}

}
