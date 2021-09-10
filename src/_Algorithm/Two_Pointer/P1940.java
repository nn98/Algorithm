package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P1940 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[]=new int[n],i=0,j=n-1,r=0;
		for(;i<n;a[i++]=s.nextInt());
		Arrays.toString(a);
		n=i=0;
		for(;i<j;i++,j--) {
			System.out.println(a[i]+" "+a[j]);
			n=a[i]+a[j];
			if(n==m)r++;
			else if(n<m)j++;
			else i--;
		}
		System.out.print(r);
	}

}
