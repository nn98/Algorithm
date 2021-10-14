package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P3273 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,j,k,r=0;
		for(;i<n;a[i++]=s.nextInt());
		k=s.nextInt();
		for(i=0;i<n-1;i++)
			for(j=0;j<n;j++)
				r+=a[i]+a[j]==k?1:0;
		System.out.println(r);
	}

}
