package _Algorithm.BackTracking;

import java.util.Arrays;

public class P9663_2 {

	static int n=new java.util.Scanner(System.in).nextInt(),r,a[],i;
	static void d(int x) {
		if(x==n)r++;
		else {
			for(int i=0;++i<=n;x--) {
				System.out.println(Arrays.toString(a));
				a[++x]=i;
				if(p(x)>0)d(x);
				else a[x]=0;
			}
		}
		a[x]=0;
	}
	static int p(int x) {
		for(int i=0;++i<x;) {
			if(a[i]==a[x])return 0;
			if(Math.abs(a[i]-a[x])==Math.abs(i-x))return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		for(;++i<=n;) {
			a=new int[15];
			a[1]=i;
			d(1);
		}
		System.out.print(r);
	}

}
