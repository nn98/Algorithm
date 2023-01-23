package BaekJoon.Two_Pointer;

import java.util.Scanner;

public class P14246_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,j,k,r=0;
		for(;i<n;a[i++]=s.nextInt());
		k=s.nextInt();
		i=0;
		for(long u=0;i<n;i++,u=0) {
			for(j=i;j<n;j++) {
				u+=a[j];
				if(u>k) {
					r+=n-j;
					break;
				}
			}
		}
		System.out.println(r);
	}

}
