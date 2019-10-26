package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11403_2 {
	static int n,a[][],i=0,j,h[];
	static void o(int p,int q) {
		if(h[q]>0)return;
		h[q]++;
//		System.out.println("\t"+p+" "+q);
		for(int k=0;k<n;k++) {
			if(a[q][k]==1) {
				a[p][k]=1;
				if(p!=k)
					o(p,k);
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
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(a[i][j]==1) {
					h=new int[n];
					o(i,j);
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.println(Arrays.toString(a[i]));
	}
}
