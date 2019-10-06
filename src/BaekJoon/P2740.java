package BaekJoon;

import java.util.Scanner;

public class P2740 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[][]=new int[n][m],b[][];
		for(int i=0;i<n;i++)for(int j=0;j<m;j++)a[i][j]=s.nextInt();
		int p=s.nextInt(),q=s.nextInt();
		b=new int[p][q];
		for(int i=0;i<p;i++)for(int j=0;j<q;j++)b[i][j]=s.nextInt();
	}

}
