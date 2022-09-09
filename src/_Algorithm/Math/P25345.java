package _Algorithm.Math;

import java.util.Arrays;
import java.util.Scanner;

public class P25345 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1,k=s.nextInt(),a[][]=new int[n][n],i=0,j,p=1000000007;
		for(;i<n;i++) {
			for(j=0;j<=i;j++)if(j==0|j==i)a[i][j]=1;else a[i][j]=(a[i-1][j-1]+a[i-1][j])%p;
		}
//		for(int[]b:a)System.out.println(Arrays.toString(b));
		j=a[n-1][k];
		for(;--k>0;j=j*2%p);
		System.out.println(j);
	}

}
