package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P1766 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1,m=s.nextInt(),a[][]=new int[n][n],c[]=new int[n],r[]=new int[n],i,j;
		for(;m-->0;) {
			i=s.nextInt();
			j=s.nextInt();
			a[j][i]++;
			c[j]++;
		}
		System.out.println(Arrays.toString(c));
		for(int[]b:a)System.out.println(Arrays.toString(b));
		m=n;
		for(;m>0;) {
			boolean C=true,D;
			for(i=0;++i<n&&C;C=c[i]>0);
			if(!C)i--;
//				D=true;
//				for(j=0;++j<n&&D;D=a[i][j]==0);
//				C=D;
			System.out.print(i+" ");
			for(j=0;++j<n;)if(a[j][i]>0) {
				a[j][i]--;
				c[j]--;
			}
			c[i]++;
			m--;
		}
	}

}
