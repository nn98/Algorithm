package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11403_2 {
	static int n,a[][],i=0,j,k,in;
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n][n];
		for(;i<n;i++) {
			for(j=0;j<n;j++) {
				in=s.nextInt();
				a[i][j]=in;
				if(in>0) {
					for(k=0;k<n;k++)
						if(a[j][k]==1)
							a[i][k]=1;
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.println(Arrays.toString(a[i]));
		//		for(i=0;i<n;i++)
		//			for(j=0;j<n;j++)
		//				if(a[i][j]==1)
		//					o(i,j);
		for(i=0;i<n;i++)
			System.out.println(Arrays.toString(a[i]));
	}
}
