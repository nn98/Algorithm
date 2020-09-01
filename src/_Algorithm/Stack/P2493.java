package _Algorithm.Stack;

import java.util.Scanner;

public class P2493 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],b[]=new int[n],i=0,j,k;
		StringBuffer f=new StringBuffer();
		for(;i<n;a[i++]=s.nextInt());
		for(i=n;i-->0;) {
			k=0;
			for(j=i;j-->0;)
				if(a[i]<=a[j]) {
					f.append(j+" ");
					k=1;
					break;
				}
			if(k==0)f.append(k+" ");
		}
		System.out.print(f.reverse());
	}

}
