package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P2846 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,j=0,r=0;
		for(;i<n;i++) {
			a[i]=s.nextInt();
			if(j==0)j=a[i];
			if(i>0)
				if(a[i]<=a[i-1]) {
					r=r>a[i]-j?r:a[i]-j;
					j=a[i];
				}
		}
		r=r>a[--i]-j?r:a[i]-j;
		System.out.print(r);
	}

}
