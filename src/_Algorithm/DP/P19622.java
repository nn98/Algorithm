package _Algorithm.DP;

import java.util.Scanner;

public class P19622 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		long a[][]=new long[n+1][3],d[][]=new long[1000001][2];
		for(;i++<n;a[i][0]=s.nextInt(),a[i][1]=s.nextInt(),a[i][2]=s.nextInt());
		d[1][1]=a[1][2];
		d[2][1]=a[2][2];
		d[2][0]=a[1][2];
		for(i=0;i++<3;d[i][0]=Math.max(d[i-1][0],d[i-1][1]),d[i][1]=d[i-1][0]+a[i][2]);
		System.out.println(Math.max(d[n][0],d[n][1]));
	}

}
