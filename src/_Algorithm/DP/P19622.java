package _Algorithm.DP;

import java.util.Scanner;

public class P19622 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		long a[][]=new long[n+1][3],d[][]=new long[1000001][2];
		for(;i++<n;a[i][0]=s.nextInt(),a[i][1]=s.nextInt(),a[i][2]=s.nextInt());
		d[1][1]=a[1][3];
		d[2][1]=a[2][3];
		d[2][0]=a[1][3];
	}

}
