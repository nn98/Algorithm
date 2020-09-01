package _Algorithm.Stack;

import java.util.Arrays;
import java.util.Scanner;

public class P2493_2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,j,k;
		for(;i<n;a[i++]=s.nextInt());
		for(i=n;i-->0;) {
			k=0;
			for(j=i;j-->0;)
				if(a[i]<=a[j]) {
					a[i]=j+1;
					k=1;
					break;
				}
			if(k==0)a[i]=0;
		}
//		System.out.println(Arrays.toString(b));
		for(int c:a)System.out.print(c+" ");
	}

}