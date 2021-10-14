package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P3273 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,j=n,k,r=0;
		for(;i<n;a[i++]=s.nextInt());
		k=s.nextInt();
		Arrays.sort(a);
		for(i=0;i<j;i++)
			for(;--j>i;)
				if(k==a[i]+a[j]) {
					r++;
					break;
				}
		System.out.println(r);
	}

}
