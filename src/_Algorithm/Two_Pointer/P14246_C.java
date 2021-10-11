package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P14246_C {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[100001],i=0,j=0,k,u=0;
		long r=0;
		for(;i<n;a[i++]=s.nextInt());
		i=0;
		k=s.nextInt();
		while(j<=n) {
			if(u<=k)u+=a[j++];
			else u-=a[i++];
			if(u>k)r+=n-j+1;
		}
		System.out.println(r);
	}

}
