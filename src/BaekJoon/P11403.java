package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;


public class P11403 {
	static int n,a[][],i=0,j;
	static void o(int f,int w) {
		System.out.println(f+" "+w);
		if(f==w||a[w][f]==1)return;
		for(int k=0;k<n;k++) {
			if(a[w][k]==1) {
				a[f][k]=1;
				o(f,k);
			}
		}
	}
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n][n];
		for(;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j]=s.nextInt();
		for(i=0;i<n;i++)
			System.out.println(Arrays.toString(a[i]));
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				if(a[i][j]==1)
					o(i,j);
		for(i=0;i<n;i++)
			System.out.println(Arrays.toString(a[i]));
	}
}
