package _Algorithm.DP;

import java.util.Scanner;

public class P12355 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,i=0,j,a[],r;
		for(;i++<n;) {
			m=s.nextInt();
			a=new int[m+1];
			r=0;
			for(j=0;j++<m;a[j]=s.nextInt(),r+=a[j]>a[j-1]?0:1);
			System.out.println("Case #"+i+": "+r);
		}
	}

}
