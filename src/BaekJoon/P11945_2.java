package BaekJoon;

import java.util.Scanner;

public class P11945_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[]in=s.nextLine().split(" ");
		int n=Integer.parseInt(in[0]),m=Integer.parseInt(in[1]),a[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			in=s.nextLine().split("");
			for(int j=0;j<m;j++)
				a[i][j]=Integer.parseInt(in[j]);
		}
		for(int i=0;i<n;i++) {
			for(int j=m-1;j>=0;j--)
				System.out.print(a[i][j]);
			System.out.println();
		}
	}
}