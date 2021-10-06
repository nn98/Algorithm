package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P14246 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],b[][]=new int[n][n],k,i=0,j;
		for(;i<n;) {
			a[i]=s.nextInt();
			for(j=0;j<=i;j++)
				for(k=i;k<n;b[j][k++]+=a[i]);
		}
		k=s.nextInt();
		for(int[]c:b)System.out.println(Arrays.toString(c));
	}

}
