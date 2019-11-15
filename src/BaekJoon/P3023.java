package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P3023 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0,j,x,y;
		s.nextLine();
		char[][]a=new char[n*=2][m*=2];
		for(;i<n/2;i++) {
			char t,k[]=s.nextLine().toCharArray();
			for(j=0;j<m/2;j++) {
				t=k[j];
				a[i][j]=t;
				a[n-i-1][j]=t;
				a[i][m-j-1]=t;
				a[n-i-1][m-j-1]=t;
			}
		}
		for(char[]r:a)
			System.out.println(Arrays.toString(r));
		x=s.nextInt()-1;
		y=s.nextInt()-1;
		if(a[x][y]=='.')
			a[x][y]='#';
		else
			a[x][y]='.';
		for(i=0;i<n;i++)
			for(j=0;j<=m;j++)
				System.out.print(i==j?"\n":a[i][j]);
	}
}