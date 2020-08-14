package _Algorithm.Math;

import java.util.Scanner;

public class P2738 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0,j,a[][]=new int[n][m];
		for(;i<n;i++)
			for(j=0;j<m;)
				a[i][j++]=s.nextInt();
		for(i=0;i<n;i++)
			for(j=0;j<m;)
				a[i][j++]+=s.nextInt();
		for(i=0;i<n;i++)
			for(j=0;j<m;)
				System.out.print(a[i][j++]+j==m-1?"\n":" ");
	}

}
