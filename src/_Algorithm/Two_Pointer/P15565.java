package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P15565 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),a[]=new int[n],i=0,j,c=0,r=Integer.MAX_VALUE;
		for(;i<n;a[i++]=s.nextInt());
		for(j=i=0;i<n|j<n;) {
			if(j<n)c+=a[j]>1?1:0;
			if(c>=k)r=r<c?r:c;
			if(j<n)j++;
			for(;c>k;c-=a[i++]>1?1:0);
		}
		System.out.println(Integer.MAX_VALUE==r?-1:r);
	}

}
