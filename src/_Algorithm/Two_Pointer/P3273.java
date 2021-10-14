package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P3273 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,j,p=n-1,k,r=0;
		for(;i<n;a[i++]=s.nextInt());
		k=s.nextInt();
		Arrays.sort(a);
		for(i=0;i<p;i++) {
			while(a[i]+a[p]>k)p--;
			for(j=p;j>i;j--)
				if(k==a[i]+a[j]) {
					r++;
					break;
				}
		}
		System.out.println(r);
	}

}
