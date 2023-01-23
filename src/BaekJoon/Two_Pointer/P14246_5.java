package BaekJoon.Two_Pointer;

import java.util.Scanner;

public class P14246_5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,j=0,k,r=0;
		long u=0;
		for(;i<n;a[i++]=s.nextInt());
		k=s.nextInt();
		for(i=0;j<n;j++) {
			u+=a[j];
			if(u>k) {
				r+=n-j;
				u-=a[i++];
			}
		}
		System.out.println(r);
	}

}
//���ù�