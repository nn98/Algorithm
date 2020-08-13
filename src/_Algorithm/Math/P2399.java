package _Algorithm.Math;

import java.util.Scanner;

public class P2399 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j,a[]=new int[n];
		long r=0;
		while(i<n) {
			a[i]=s.nextInt();
			for(j=0;j<i;j++)
				r+=Math.abs(a[i]-a[j]);
			i++;
		}
		System.out.print(r*2);
	}

}
