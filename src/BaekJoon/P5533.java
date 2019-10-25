package BaekJoon;

import java.util.Scanner;

public class P5533 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[][]=new int[n][3],h[][]=new int[3][101],
				r[]=new int[n],p;
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				p=s.nextInt();
				a[i][j]=p;
				h[j][p]++;
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<n;j++) {
				p=a[j][i];
				if(h[i][p]<2)
					r[j]+=p;
			}
		}
		for(int t:r)System.out.println(t);
	}
}