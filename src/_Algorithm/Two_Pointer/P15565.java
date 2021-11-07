package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P15565 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),a[]=new int[n],i=0,j,b=0,c=0,r=Integer.MAX_VALUE;
		for(;i<n;a[i++]=s.nextInt());
		for(j=i=0;i<n|j<n;) {
			c++;
			if(c>=k)r=r<c?r:c;
			for(;c>k;c--,i++);
			if(j<n)j++;
			else {
				for(;i<n;)
			}
		}
		System.out.println(Integer.MAX_VALUE==r?-1:r);
	}

}
