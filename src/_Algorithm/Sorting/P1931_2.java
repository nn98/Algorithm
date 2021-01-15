package _Algorithm.Sweeping;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1931_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[][]=new int[n][2],i=0,j=0,k=0;
		for(;i<n;a[i][0]=s.nextInt(),a[i++][1]=s.nextInt());
//		for(i=0;i<n;System.out.println(Arrays.toString(a[i++])));
		Arrays.sort(a,new Comparator<int[]>() {
			@Override
			public int compare(int[] q,int[] w) {
				if(q[1]==w[1])return q[0]-w[0];
				return q[1]-w[1];
			}
		});
//		for(i=0;i<n;System.out.println(Arrays.toString(a[i++])));
		for(i=0;i<n;i++)
			if(k<=a[i][0]) {
				k=a[i][1];
				j++;
			}
		System.out.println(j);
	}

}
