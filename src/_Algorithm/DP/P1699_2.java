package _Algorithm.DP;

import java.util.Arrays;

public class P1699_2 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=2,j,a[]=new int[n];
		for(;i<n;i++)
			for(j=2;j*j<=i;j++)
				a[i]=Math.min(a[i],a[i-j*j]+1);
		System.out.println(Arrays.toString(a));
	}

}
