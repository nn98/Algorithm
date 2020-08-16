package _Algorithm.Math;

import java.util.Scanner;

public class P15501 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,a[]=new int[n],b[]=new int[n],j=0,r=0,x=0;
		for(;i<n;) {
			a[i]=s.nextInt();
			if(a[i++]==1)x=i-1;
		}
		System.out.println(x);
	}

}
