package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P14246 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a,b[][]=new int[n][n],k,i=0,j;
		for(;i<n;i++) {
			a=s.nextInt();
			for(j=0;j<=i;j++)
				for(k=i;k<n;b[j][k++]+=a);
		}
		k=s.nextInt();
//		for(int[]c:b)System.out.println(Arrays.toString(c));
		a=0;
		for(i=0;i<n;i++)
			for(j=i;++j<n;a+=b[i][j]>k?1:0);
	}

}
