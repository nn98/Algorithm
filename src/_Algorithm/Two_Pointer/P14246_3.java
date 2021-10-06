package _Algorithm.Two_Pointer;

//wtf

import java.util.Scanner;

public class P14246_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j,a[]=new int[n],k,r=0;
		long u;
		for(;i<n;a[i++]=s.nextInt());
		k=s.nextInt();
		for(i=0;i<n;i++) {
			u=0;
			for(j=i;j<n;j++) {
				u+=a[j];
				if(u>k)r++;
			}
		}
		System.out.println(r);
	}

}
