package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P15565 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),a[]=new int[n],i=0,j,b=0,c=0,r=Integer.MAX_VALUE;
		for(;i<n;a[i++]=s.nextInt());
		for(j=i=0;i<n|j<n;) {
			c++;
			b+=a[j]<2?1:0;
			if(b>=k)r=r<c?r:c;
			for(;b>k;c--,b-=a[i++]<2?1:0);
			if(++j<n);
			else {
				for(;i<n;c--,b-=a[i++]<2?1:0)
					if(b>=k)r=r<c?r:c;
			}
		}
		System.out.println(Integer.MAX_VALUE==r?-1:r);
	}

}