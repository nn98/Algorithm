package BaekJoon;

import java.util.Scanner;

public class P10844 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[][]=new int[101][11],r=0;
		for(int i=1;i<10;i++)a[1][i]=1;
		for(int i=2;i<=n;i++) {
			a[i][0]=a[i-1][1];
			for(int j=1;j<10;j++)a[i][j]=(a[i-1][j-1]+a[i-1][j+1])%1000000000;
		}
		for(int i=0;i<10;i++)r=(r+a[n][i])%1000000000;
		System.out.print(r%1000000000);
	}
}