package BaekJoon;

import java.util.Scanner;

public class P11403_S {
	static int n,a[][],i=0,j,k=0,h[];
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n][n];
		for(;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j]=s.nextInt();
		for(;k<n;k++)
			for(i=0;i<n;i++)
				for(j=0;j<n;j++)
					if(a[i][k]==1&&a[k][j]==1)
						a[i][j]=1;
		for(i=0;i<n;i++) {
			String r="";
			for(j=0;j<n;j++)
				r+=a[i][j]+" ";
			System.out.println(r.trim());
		}
	}
}