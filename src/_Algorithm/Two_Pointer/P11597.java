package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P11597 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,r=2000000;
		for(;i<n;a[i++]=s.nextInt());
		for(i=0;i<n/2;i++)
			if(a[i]+a[n-i-1]<r)r=a[i]+a[n-i-1];
		System.out.print(r);
	}

}
