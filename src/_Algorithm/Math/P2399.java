package _Algorithm.Math;

import java.util.Scanner;

public class P2399 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j,r=0,a[]=new int[n];
		while(i<n) {
			a[i]=s.nextInt();
			for(j=0;j<i;j++)
				r+=Math.abs(a[j]-a[i]);
			i++;
		}
		System.out.print(r);
	}

}
